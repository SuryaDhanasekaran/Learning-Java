public class wordReverse {
  public static void main(String[] args) {
    
    String str = "Welcome to Java world";
    String splitArray[] = str.split(" ");

    for(int i=splitArray.length-1;i>=0;i--)
    {
      System.out.println(splitArray[i]);
    }
  }
  
}
