/*
 * How to compare two Strings in java without built in functions
 * 
 * Str1 = Sandeep;
 * Str2 = Sandeep;
 * S = S -> True
 * else False
 */




public class cmpString {

  public static void main(String args[])
  {
    String str1 = "Surya";
    String str2 = "Surya";
    boolean isCompare = false;

    for(int i=0;i<str1.length();i++)
    {
      if(str1.charAt(i)!=str2.charAt(i))
      {
         isCompare = false;
         break;

      }
      isCompare = true;
    }
    System.out.println("Both the strings are equal " + isCompare);
  }
  
}
