package com.company;


import java.util.LinkedList;

public class WordList {

    public static void main(String[] args) {

       String[] wordList = {"byte", "case", "catch", "class", "const",
          "continue", "do", "double", "else", "extends"};

        LinkedList<String> wordList2 = new LinkedList<>();




        for(String element : wordList) {
          //  System.out.println(element);
            wordList2.add(element);
        }

        System.out.println(wordList2);






    }

}
