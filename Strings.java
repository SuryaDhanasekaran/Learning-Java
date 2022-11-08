

public class Strings{
    public static void main(String args[]){

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;//myInt treated as string
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);


    }

    //byte
    //short
    //int
    //long
    //float
    //double
    //char
    //boolean


    
}

/*
 * String is a datatype in Java,which is not a primitive type. It's actually a Class,but it enjoys a bit
 *of favoritism in java to make it easier to use than a regular class.

 String:
      A String is a sequence of characters.In the case of the char which you can see above which we
      discussed in the previous video,it could contain a single character only(regular character or Unicode character.)

      A String can contain a sequence of character. A large number of characters. Technically its limited
      by memory or the MAX_VALUE of int which was 2.14 Billon.That's a lot of characters.
 */

 /*
  * Strings in java are immutable

  When I said you can delete characters out of a String that's not strictly true.Becuase String in java
  are immutable.That means you can't change a String after it's created instead,what happens is a new
  String is created.

  //StringBuffer
  */