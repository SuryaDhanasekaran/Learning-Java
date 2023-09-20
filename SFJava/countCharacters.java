/*
 * Write a java Program to find number of words in a sentence and the corresponding character count?
 * 
 * eg: Hello World -> 'h' 'e' 'l'
 * 
 * Hello -> 5
 * World -> 5
 * 
 * Here we have to find out number of words in sentence and the corresponding character count of each word
 * 
 * Here first we create an char array from given String using String Class toCharArray() methods
 * 
 * Now we iterate the char array using for loop. Inside for loop we declare a String with empty implementation.
 * 
 * Whenever we found an alphabet we will perform concatenation of that alphabet with the String variable and increment the value of i.
 */
public class countCharacters
{
  public static void main(String[] args) {
    String str = "Hello World";
    count(str);
  }
  static void count(String str)
  {
    //Create an char array of given String
    char[] ch = str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      //Declare an String with empty initialization
      String s = "";

      //When the character is not space
      while(i < ch.length && ch[i] != ' ')
      {
        //concat with the delcared String
        s = s + ch[i]; // "World"
        i++;
      }
      if(s.length() > 0)
      {
        System.out.println(s + "->" + s.length());
      }
    }
  }
}