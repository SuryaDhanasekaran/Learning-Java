/*
 * Check if string palindrome or not in java
 * 
 * If original string and reverse string are same as per alphabetical order we say string is palindrome
 * 
 * Input a String
 * 
 * Find the reverse of a String
 * 
 * Check if the original String and reverse String are same or not
 * 
 * If both are equal print palindrome else print give string is not palindrome
 */

import java.util.Scanner;

public class stringPalindrome {
  public static void main(String[] args) {

    String reverse = "";

    System.out.println("Enter the input string:");

    Scanner sc = new Scanner(System.in);
    String original = sc.nextLine();

    for(int i=original.length()-1;i>=0;i--)
    {
      reverse = reverse + original.charAt(i);
    }
    if(original.equals(reverse))
    {
      System.out.println("Given String is Palindrome");
    }
    else{
      System.out.println("Given String is Not Palindrome");
    }
  }
  
}

