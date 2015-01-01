package com.company;

import java.util.*;

public class WeightFinder {
    ArrayList<Integer> docLen;
    double avgDocLen;
    int collectionSize;
    ArrayList<Integer> maxTF;
    TreeMap<Integer, TreeSet<String>> queryDictionary;
    TreeMap<Integer, TreeMap<String, Integer>> stemmedDictionary;
    TreeMap<String, Integer> docFrequency = new TreeMap<String, Integer>();
    ArrayList<PriorityQueue<pairW>> top10W1 = new ArrayList<PriorityQueue<pairW>>();
    ArrayList<PriorityQueue<pairW>> top10W2 = new ArrayList<PriorityQueue<pairW>>();

    public WeightFinder(TreeMap<Integer, TreeMap<String, Integer>> stemmedDictionary, TreeMap<Integer, TreeSet<String>> queryDictionary, ArrayList<Integer> docLen, double avgDocLen, int collectionSize, ArrayList<Integer> maxTF) {
        this.docLen = docLen;
        this.avgDocLen = avgDocLen;
        this.collectionSize = collectionSize;
        this.maxTF = maxTF;
        this.queryDictionary = queryDictionary;
        this.stemmedDictionary = stemmedDictionary;
    }

    public void findWeight() {
        findDocFrequency();
        // Find w1 and w2 for each query-document pair
        int errorCount = 0;
        for(Map.Entry<Integer, TreeSet<String>> e1 : queryDictionary.entrySet()) {
            TopNSorter top10Sorter = new TopNSorter();
            PriorityQueue<pairW> tempTop10W1 = new PriorityQueue<pairW>(10, top10Sorter);
            PriorityQueue<pairW> tempTop10W2 = new PriorityQueue<pairW>(10, top10Sorter);
            for(Map.Entry<Integer, TreeMap<String, Integer>> e2 : stemmedDictionary.entrySet()) {
                Double w1 = 0.0;
                Double w2 = 0.0;
                int tf = 0, df = 0, mTF = 0, dL = 0;

                for(String qWord : e1.getValue()){
                    if(e2.getValue().containsKey(qWord)){
                        tf = e2.getValue().get(qWord);
                        df = docFrequency.get(qWord);
                        mTF = maxTF.get(e2.getKey());
                        dL = docLen.get(e2.getKey());
                        w1 = w1 + (0.4 + 0.6 * Math.log(tf + 0.5)/Math.log(mTF + 1.0))
                                    * (Math.log(collectionSize/df)/Math.log(collectionSize));
                        w2 = w2 + (0.4 + 0.6 * (tf / (tf  + 0.5 + 1.5 * (dL / avgDocLen)))
                                    * Math.log(collectionSize/df)/Math.log(collectionSize));
                    } else {
                        tf = 0;
                        df = docFrequency.get(qWord);
                        mTF = maxTF.get(e2.getKey());
                        dL = docLen.get(e2.getKey());
                        if(df == 0) {
                            w1 = w1 + 0.0;
                            w2 = w2 + 0.0;
                        } else {
                            w1 = w1 + (0.4 + 0.6 * Math.log(tf + 0.5)/Math.log(mTF + 1.0))
                                    * (Math.log(collectionSize/df)/Math.log(collectionSize));
                            w2 = w2 + (0.4 + 0.6 * (tf / (tf  + 0.5 + 1.5 * (dL / avgDocLen)))
                                    * Math.log(collectionSize/df)/Math.log(collectionSize));
                        }
                    }
                }
                // Discard weights that show up as infinity
                if(w1.isInfinite())
                    w1 = 0.0;
                if(w2.isInfinite())
                    w2 = 0.0;

                // Create a new pair object and add it to the correct Priority Queue
                int docId = e2.getKey();
                pairW pW1 = new pairW(docId, w1);
                pairW pW2 = new pairW(docId, w2);

                // Limit the size of the queues to 10
                if(tempTop10W1.size() == 10) {
                    tempTop10W1.add(pW1);
                    tempTop10W1.poll();
                } else {
                    tempTop10W1.add(pW1);
                }

                if(tempTop10W2.size() == 10) {
                    tempTop10W2.add(pW2);
                    tempTop10W2.poll();
                } else {
                    tempTop10W2.add(pW2);
                }
            }
            // Add the queues to the array lists
            top10W1.add(tempTop10W1);
            top10W2.add(tempTop10W2);
        }
    }

    public void findDocFrequency() {
        for(Map.Entry<Integer, TreeSet<String>> e1 : queryDictionary.entrySet()) {
            for(String qWord : e1.getValue()) {
                int count = 0;
                for(Map.Entry<Integer, TreeMap<String, Integer>> e2 : stemmedDictionary.entrySet()) {
                    if(e2.getValue().containsKey(qWord)) {
                        count = count + 1;
                    }
                }

                if(!docFrequency.containsKey(qWord)) {
                    docFrequency.put(qWord, count);
                }
            }
        }

        /*for(Map.Entry<String, Integer> e : docFrequency.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }*/
    }

    public void printHitList(HashMap<Integer, String> titleDictionary) {
        HashMap<Integer, String> title = titleDictionary;
        for(int i = 0; i < queryDictionary.size(); i++) {
            // Print the query in it's indexed format
            System.out.println("Q"+(i+1));
            System.out.println(queryDictionary.get(i+1).toString());

            // Print the hit list for W1
            System.out.println("Rank\tDocId\tW1\t\t\t\tTitle");
            System.out.println("=====================================================================================");

            int rank1 = 0;
            while(top10W1.get(i).size() > 0) {
                pairW content = top10W1.get(i).poll();
                System.out.println((10 - rank1) + "\t\t" + content.docId + "\t" + content.w + "\t" + title.get(content.docId - 1));
                rank1 = rank1 + 1;
            }

            // Print the hit list for W2
            System.out.println();
            System.out.println("Rank\tDocId\tW2\t\t\t\tTitle");
            System.out.println("=====================================================================================");

            int rank2 = 0;

            while(top10W2.get(i).size() > 0) {
                pairW content = top10W2.get(i).poll();
                System.out.println((10 - rank2) + "\t\t" + content.docId + "\t" + content.w + "\t" + title.get(content.docId - 1));
                rank2 = rank2 + 1;
            }
            System.out.println();
        }
    }
}

class TopNSorter implements Comparator<pairW> {
    public int compare(pairW p1, pairW p2) {
        if(p1.w > p2.w)
            return 1;

        if(p1.w < p2.w)
            return  -1;

        return 0;
    }
}

class pairW {
    double w;
    int docId;

    public pairW(int docId, double w) {
        this.docId = docId;
        this.w = w;
    }
}
