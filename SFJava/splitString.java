/*
 * How to Split a String in java
 * 
 * String class split method
 * Pattern.compile(regex).splitAsStream(String)
 * String tokenizer
 * StringUtils.split(String,"expr")
 * Splitter.on("expr").split(s);
 */



public class splitString {
  public static void main(String[] args) {
    String s = "091-1234567890";
    String str[] = s.split("-");
    printString(str,"String Split Method");


  }
  public static void printString(String str[],String approach)
  {
    System.out.println("Splitting string by using " + approach);
    for(String string:str)
    {
      System.out.println(string);
    }

  }

  
}
