/*
 * Write a Java Program to Check Two String are Anagrams or Not using arrays comparision?
 * 
 * Two Strings are anagram if they contain same characters but different oder.
 * 
 * ex: JAVA AVAJ
 * 
 * Take two strings as input
 * 
 * convert two strings to charcter array
 * 
 * Sort two charcter arrays using Arrays.sort() method
 * 
 * Compare two string arrays if they are equal they are anagrams otherwise they are not anagrams.
 */

import java.util.Arrays;

public class Anagrams {

  public static void main(String[] args) {

    String str1 = "java";
    //String str2 = "avaj";
    String str2 = "guava";
    System.out.println("Both strings are anagrams " + anagramCheck(str1, str2));

    
  }

  public static boolean anagramCheck(String str1,String str2)
  {
    char[] charArrayFromString1 = str1.toCharArray();
    char[] charArrayFromString2 = str2.toCharArray();

    Arrays.sort(charArrayFromString1);
    Arrays.sort(charArrayFromString2);



    return Arrays.equals(charArrayFromString1,charArrayFromString2);
  }
  
}
