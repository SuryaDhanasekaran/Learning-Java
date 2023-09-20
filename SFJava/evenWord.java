/*
 * Write a java program to print even length words in a String?
 * 
 * Hell World
 * Hell - 4
 * World - 5
 */




public class evenWord
{
  public static void main(String args[])
  {
    String str = "Hell World We lol";

    for(String s : str.split(" "))
    {
      if(s.length()%2 == 0)
      {
        System.out.println(s);
      }
    }
  }
}