/*
 * How to reverse a String in java using recursion
 * 
 * Sandy -> ydnaS
 * 1.andy + S
 * 2.ndy + a + S
 * 3.dy + n + a + S
 * 4.y + d + n + a + s
 */
public class stringRecursion {

  public static void main(String[] args) {
    
    String s = "Surya";
    System.out.println(recursiveString(s));

  }
  private static String recursiveString(String s)
  {
    if(s==null || s.length()<=1)
    {
      return s;
    }
    return recursiveString(s.substring(1))+s.charAt(0);
  }

  
}
