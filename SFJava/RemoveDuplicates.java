//package SFJava;
//package SFJava;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

  public static void main(String[] args) {

    //Create a String in which duplicates has to removed
    String str = "suryaa";
    System.out.println(removeDuplicates(str));

    
  }
  //Write a method removeDuplicates Which accepts Strings and it should return String
  public static String removeDuplicates(String str)
  {
    //Create a Hashset
    Set<Character> set = new HashSet<>();
    //Create a string buffer
    StringBuffer sf = new StringBuffer();

    //Loop through the each character in the String

    for(int i=0;i<str.length();i++)
    {
      //Take each character from array and check in hashset if it is not present in hashset add to hashset and stringbuffer.
      Character c = str.charAt(i);//str.charAt(0) -> s
      if(!set.contains(c))        //If 's' not present in hashset
      {                           //Add s to th
        set.add(c);               // s
        sf.append(c);
      }
    }
    //return string object
    return sf.toString();
  }

}
