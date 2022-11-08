public class ByteShortIntLong{
    public static void main(String args[]){
        int myValue = 100000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;

    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));//Overflow
    
    System.out.println("Busted MIN value = " + (myMinIntValue - 1));//Underflow

    int myMaxIntTest = 2_147_483_647;
    System.out.println(myMaxIntTest);;


     byte myMinByteValue = Byte.MIN_VALUE;
     byte myMaxByteValue = Byte.MAX_VALUE;
     System.out.println("Byte Minumum Value = " + myMinByteValue);
     System.out.println("Byte Maximum Value = " + myMaxByteValue);

     short myMinshortValue = Short.MIN_VALUE;
     short myMaxshortValue = Short.MAX_VALUE;
     System.out.println("short Minumum Value = " + myMinshortValue);
     System.out.println("short Maximum Value = " + myMaxByteValue);
    
    //short myMinshortValue = Short.MIN_VALUE;
    //short myMaxshortValue = Short.MAX_VALUE;
    System.out.println("short Minumum Value = " + myMinshortValue);
    System.out.println("short Maximum Value = " + myMaxshortValue);

    long myLongValue = 100000L;
    long myMinlongValue = Long.MIN_VALUE;
    long myMaxlongValue = Long.MAX_VALUE;
    System.out.println("long Minumum Value = " + myMinlongValue);
    System.out.println("long Maximum Value = " + myMaxlongValue);

    long bigLongLiteralValue = 2_147_483_647_243L;
    System.out.println(bigLongLiteralValue);

    short bigShortLiteralValue = 32767;

    int myTotal = (int) (myMinIntValue / 2);

    byte myNewByteValue = (byte)  (myMinByteValue / 2); 

    short myNewShortValue = (short) (myMinshortValue / 2);//Casting
    //System.out.println(myMaxByteValue);


    byte challengeByte = 10;

    short challengShort = 20;

    int chellengeInt = 50;

    long challengeLong = (50000L) + (10L * (challengeByte + challengShort + chellengeInt));

    System.out.println(challengeLong);

    short shortTotal = (short)(1000 + 10 * (challengeByte + challengShort + chellengeInt));

    







    // Byte - 8 bits

//Short - 16 bits

//Int - 32 bits


    

    }



    
}

