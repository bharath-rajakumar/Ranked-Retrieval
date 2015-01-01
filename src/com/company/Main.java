package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String cranfield_path = "";
        Scanner in = new Scanner(System.in);

        // Get the path of Cranfield folder from the user
        System.out.println("Enter the complete path of the Cranfield documents directory");
        cranfield_path = in.nextLine();
        //cranfield_path = args[0];

        // Get the path of Query Document from the user
        System.out.println("Enter the complete path of the Query document");
        String queryPath = in.nextLine();
        //String queryPath = args[1];

        // Build the stemmed index
        IndexBuilder myIndex = new IndexBuilder(cranfield_path);
        myIndex.buildIndex();

        // Get the weighting term functions parameters from the index
        ArrayList<Integer> docLen = myIndex.getDocLen();
        //System.out.println("Doc Length :" + docLen.toString());

        double avgDocLen = myIndex.getAvgDocLen();
        //System.out.println("Average Document Length : " + avgDocLen);

        int collectionSize = myIndex.getCollectionSize();
        //System.out.println("Collection Size : " + collectionSize);

        ArrayList<Integer> maxTF = myIndex.getMaxTF();
        //System.out.println("Max TF : " + maxTF.toString());

        QueryIndexer myQueryIndexer = new QueryIndexer(queryPath);
        myQueryIndexer.parseQuery();

        TreeMap<Integer, TreeSet<String>> queryDictionary = myQueryIndexer.getQueryDictionary();

        WeightFinder wf = new WeightFinder(myIndex.getStemmedDictionary(), queryDictionary, docLen, avgDocLen, collectionSize, maxTF);
        wf.findWeight();
        wf.printHitList(myIndex.getTitle());
	}
}
