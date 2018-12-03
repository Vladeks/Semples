package com.company;

public class Encode {

    public static void main(String[] args) {
	// write your code here
        String word = "pok";

        String[] array = shiftWord(word);
        System.out.println("\n Shift Array \n");
        showArray(array);
        System.out.println("\n Sorted Array \n");
        sort(array);
        showArray(array);
        System.out.println("\nOriginal word position: " + getWordPosition(array, word));
        System.out.println("Last word: " + getLastWord(array));
    }

    private static void showArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }

    private static String[] shiftWord(String word) {
        String[] array = new String[word.length()];
        array[0] = word;
        for (int i = 1; i < word.length(); i++) {
            array[i] = letterToEndOfWord(array[i-1]);
        }
        return array;
    }

    private static String letterToEndOfWord(String word) {
        return word.substring(1).concat(word.substring(0,1));
    }

    private static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
//                if (array[i].charAt(0) < array[j].charAt(0)) {
                if (array[i].compareToIgnoreCase(array[j]) < 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static int getWordPosition(String[] array, String word) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(word)) {
                return i+1;
            }
        }
        return -1;
    }

    private static String getLastWord(String[] array) {
        return array[array.length-1];
    }



}
