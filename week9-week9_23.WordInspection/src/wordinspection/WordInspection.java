/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafal
 */
public class WordInspection {

    private File file;
    private Scanner reader;
    private List<String> allWords;
    //private List<String> containZ;
    //private List<String> endingL;
    //private List<String> palindromes;
    //private List<String> vowels;

    public WordInspection(File file) throws Exception {
        this.file = file;
        allWords = new ArrayList<String>();
        //containZ = new ArrayList<String>();
        //endingL = new ArrayList<String>();
        //palindromes = new ArrayList<String>();
        //vowels = new ArrayList<String>();
    }

    public int wordCount() throws Exception {

        reader = new Scanner(this.file, "UTF-8");
        int count = 0;
        while (reader.hasNext()) {
            String word = reader.next();
            allWords.add(word);
            count++;
        }
        reader.close();
        return count;
    }

    public List<String> wordsContainingZ() throws Exception {
        wordCount();
        List<String> containZ = new ArrayList<String>();
        for (String z : allWords) {
            if (z.contains("z")) {
                containZ.add(z);
            }
        }
        System.out.println(containZ);
        return containZ;
    }

    public List<String> wordsEndingInL() throws Exception {
        wordCount();
        List<String> endingL = new ArrayList<String>();
        for (String l : allWords) {
            if (l.endsWith("l")) {
                endingL.add(l);
            }
        }
        System.out.println(endingL);
        return endingL;
    }

    public List<String> palindromes() throws Exception {
        wordCount();
        List<String> palindromes = new ArrayList<String>();
        for (String checkIfPalindrome : allWords) {
            if (IfPalindrome(checkIfPalindrome)) {
                palindromes.add(checkIfPalindrome);
            }
        }
        return palindromes;
    }

    public boolean IfPalindrome(String word) {
        String palindrome = "";
        for (int i = word.length(); i > 0; i--) {
            palindrome += word.charAt(i - 1);
        }
        if (palindrome.equalsIgnoreCase(word)) {
            return true;
        }
        return false;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        wordCount();
        List<String> vowels = new ArrayList<String>();
        for (String ifVowels : allWords) {
            if (ifVowels.contains("a") && ifVowels.contains("e")
                    && ifVowels.contains("i")
                    && ifVowels.contains("o") && ifVowels.contains("u")
                    && ifVowels.contains("y") && ifVowels.contains("ä")
                    && ifVowels.contains("ö")) {
                vowels.add(ifVowels);
            }
        }
        return vowels;
    }
}
