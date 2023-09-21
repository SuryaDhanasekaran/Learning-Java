/*
 * For a given String S,write a program to print the characters in their descending order of frequency of occurence in string S.
 * 
 * Frequency of Occurence is the number of times a character is repeated in a string.
 * 
 * For eg.In the string banana
 * 
 * The frequency of occurence of b is 1.
 * 
 * The frequency of occurence of a is 3.
 * 
 * The frequency of occurence of n is 2.
 * 
 * 
 */
import java.util.*;
import java.util.Map.Entry;

public class printFrequency {
  
  public static void main(String[] args) {

    String s = "Banana";
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
      char c = s.charAt(i);
      Integer value = map.get(c);

      if(value!=null)
      {
        map.put(c,value+1);
      }
      else{
        map.put(c,1);
      }
    }
    Set<Entry<Character,Integer>> set = map.entrySet();
    List<Entry<Character,Integer>> list = new ArrayList<>(set);
    Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {

      @Override
      public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
      }
      
    });
    for(Entry<Character,Integer> entry: list)
    {
      System.out.println("The frequency of occurency of " + entry.getKey() + " " + entry.getValue());
    }
  }
  
}
