package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class QueryIndexer {

    String filePath;
    TreeMap<Integer, TreeSet<String>> queryDictionary = new TreeMap<Integer, TreeSet<String>>();
    HashMap<String, Integer> stopWords = createStopWordDictionary();
    Stemmer s;

    public QueryIndexer(String filePath) {
        this.filePath = filePath;
    }

    public void parseQuery() {
        int count = 1;
        StringBuilder query = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while((currentLine = br.readLine()) != null) {
                if(currentLine.equals("")||currentLine.equals(null)) {
                    TreeSet<String> qWordList = new TreeSet<String>();
                    String[] queryWords = query.toString().split(" ");
                    for(String qWord : queryWords) {
                        if(!(qWord.equals("")))
                            qWordList.add(qWord);
                    }
                    // Add the query to the dictionary
                    queryDictionary.put(count, qWordList);
                    count = count + 1;
                    query = query.delete(0, query.length() - 1);
                } else {
                    if(!currentLine.contains(":")) {
                        query = query.append(" " +currentLine);
                    }
                }
            }
            TreeSet<String> qWordList = new TreeSet<String>();
            String[] queryWords = query.toString().split(" ");
            for(String qWord : queryWords) {
                if(!(qWord.equals("")))
                    qWordList.add(qWord);
            }
            queryDictionary.put(count, qWordList);
        } catch(IOException e) {
            System.out.println(e.toString());
        }
        tokenizeQueryDictionary();
        stemQueryDictionary();
    }

    private void stemQueryDictionary() {
        s = new Stemmer();
        for(Map.Entry<Integer, TreeSet<String>> e : queryDictionary.entrySet()) {
            TreeSet<String> temp = new TreeSet<String>();
            for(String word : e.getValue()) {
                String stemmedWord = stemThisToken(word);
                temp.add(stemmedWord);
            }
            queryDictionary.put(e.getKey(), temp);
        }
    }

    private String stemThisToken(String token) {
        String currentString = token;
        int stringLength = currentString.length();
        char[] v = currentString.toCharArray();
        for(int i = 0; i < stringLength; i++) {
            s.add(v[i]);
        }
        s.stem();
        return s.toString();
    }

    private void tokenizeQueryDictionary() {
        for(Map.Entry<Integer, TreeSet<String>> e : queryDictionary.entrySet()) {
            TreeSet<String> temp = new TreeSet<String>();
            for(String word : e.getValue()) {
                if(!stopWords.containsKey(word)) { // eliminate all tokens that are present in stopword dictionary
                    // lowercase all tokens
                    word = word.toLowerCase();

                    // remove all dot symbols ( . )
                    word = word.replaceAll("\\.","");

                    // remove all coma symbols ( , )
                    word = word.replaceAll(",","");

                    // remove all hyphen symbols ( - )
                    word = word.replaceAll("-","");

                    // remove all close brace symbols ( ) )
                    word = word.replaceAll("\\)","");

                    // remove all open brace symbols ( ( )
                    word = word.replaceAll("\\(","");

                    // remove all forward slash symbols ( / )
                    word = word.replaceAll("/","");

                    // remove all backward slash symbols ( \ )
                    word = word.replaceAll("\\\\","");

                    // remove all possessive symbols ( ' )
                    word = word.replaceAll("'","");

                    if(word != "" && word != null && word.length() > 2 && !word.matches(" ")) {
                        temp.add(word);
                    }
                }
            }
            queryDictionary.put(e.getKey(), temp);
        }
    }

    private HashMap<String, Integer> createStopWordDictionary() {
        HashMap<String, Integer>  stopWords = new HashMap<String, Integer>();
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("a", "all", "an", "and", "any", "are", "as", "be", "been", "but", "by",
                "few", "for", "have", "he", "her", "here", "him", "his", "how", "i", "in", "is", "it", "its", "many", "me", "my", "none", "of",
                "on", "or", "our", "she", "some", "the", "their", "them", "there", "they", "that", "this", "us", "was", "what", "when", "where",
                "which", "who", "why", "will", "with", "you", "your"));
        for(String word : wordList) {
            stopWords.put(word, 1);
        }
        return stopWords;
    }

    public TreeMap<Integer, TreeSet<String>> getQueryDictionary() {
        return queryDictionary;
    }
}
