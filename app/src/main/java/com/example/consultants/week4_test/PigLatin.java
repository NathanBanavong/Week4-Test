package com.example.consultants.week4_test;

/*
PigLatin:

a made-up language formed from English by transferring the initial consonant or consonant
cluster of each word to the end of the word and adding a vocalic syllable (usually ˈpiɡ ˌlatn:
so chicken soup would be translated to ickenchay oupsay . Pig Latin is typically spoken
playfully, as if to convey secrecy.
*/

import java.util.ArrayList;
import java.util.List;

public class PigLatin {

    private static Node begin = null;
    private static Node end;

    public static void main(String[] args) {
        String statement = "chicken";
        char[] charArr = statement.toCharArray();
        convert2String(charArr);
    }

    public static class Node {
        public char data;
        public Node next;

        Node(char ch) {
            data = ch;
            next = null;
        }
    }


    public static void convert2String(char[] charList) {
//        counter = 0;    //set the increment for node pointer

//        TODO does not pass newnode data into begin data
        for (int i = 0; i < charList.length; i++) {
            if (charList[i] != 'a'
                    || charList[i] != 'e'
                    || charList[i] != 'i'
                    || charList[i] != 'o'
                    || charList[i] != 'u') {
                addCharacter(charList[i]);
//                Node newNode = new Node(charList[i]);
//                newNode.next = end;
//                end.next = null;
            }else {
                if (begin == null) {
                    Node newNode = new Node(charList[i]);
                    begin.data = newNode.data;
                    begin.next = end;
                } else {
                    Node newNode = new Node(charList[i]);
                    end.next = newNode.next;
                }
            }
        }
        System.out.println(charList);
    }

    public static void addCharacter(char ch) {
        Node newNode = new Node(ch);
        newNode.next = end;
        end.next = null;
    }

//    public static void convertString(char[] statement) {
//        char[] charArr = statement.toCharArray();
//        int x;
//
//        for (int i = 0; i < statement.length(); i++) {
//            //if not a vowel push to end
//            if (statement.charAt(i) != 'a'
//                    || statement.charAt(i) != 'e'
//                    || statement.charAt(i) != 'i'
//                    || statement.charAt(i) != 'o'
//                    || statement.charAt(i) != 'u') {
//                x = statement.length();
//                charArr[x] = statement.charAt(i);
////                charArr[i + 1] = statement.charAt(i);
//            } else {
//                charArr[i] = statement.charAt(i);
//            }
//        }
//        System.out.println(charArr);
//    }


}
