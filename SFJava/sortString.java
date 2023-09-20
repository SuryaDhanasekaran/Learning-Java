/*
 * Write a Java Program to Sort Characters in String
 * 
 * Java aavJ
 * 
 * j,a,v,a
 * 
 * Here are the steps to be followed to sort characters in string
 * 
 * Take one string as input
 * 
 * convert first string to character array.
 * 
 * Sort the characters in array using arrays.sort() method
 * 
 * Construct string by using sorted character array.
 */



import java.util.*;
public class sortString {

  public static void main(String[] args) {

    String str = "sandeep";
    char ch[] = str.toCharArray();
    Arrays.sort(ch);
    String sortedStr = new String(ch);
    System.out.println(sortedStr);
    
  }
  
}
