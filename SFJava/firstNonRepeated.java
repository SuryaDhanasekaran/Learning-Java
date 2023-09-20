/*
 * How to find First Non-Repeated Character from String?
 * 
 * three diff ways?
 * 
 * Approach 1:
 * 
 * It first gets character array from given String
 * 
 * Build Linked hash map with character as key and their count as value. If a key already exist increment the value elese store 1 for corresponding key.
 * 
 * In next step, It loop throught LinkedHashMap to find an entry with value 1, that's your first non-repeated character, because LinkedHashMap maintains insertion order and we iterate through character array from beginning to end.
 * 
 */

import java.util.*;
import java.util.Map.Entry;

public class firstNonRepeated {
  public static void main(String[] args) {

    char c = getFirstNonRepeatedChar("aabbddef");
    System.out.println("Non Repeated Character= "+c);
  }

  public static char getFirstNonRepeatedChar(String str)
  {
    Map<Character,Integer> countMap = new LinkedHashMap<Character,Integer>();
    for(char ch: str.toCharArray())
    {
      countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
    }
    for(Entry<Character,Integer> entry : countMap.entrySet())
    {
      if(entry.getValue() == 1)
      {
        return entry.getKey();
      }
    }
    throw new RuntimeException("didn't find any non repeated Character");
    
  }
  
}
