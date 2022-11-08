public class FloatAndDouble {

    public static void main(String args[])
    {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMindoubleValue);
        System.out.println("double maximum value = " + myMaxdoubleValue);

        int myIntValue = 5/3;
        // float myFloatValue = 5.25f; //use f or casting float myFloatValue = (float) 5.25
        // double myDoubleValue = 5.25d;// use d

        //  float myFloatValue = 5/2;
        //  double myDoubleValue = 5d;
        //  System.out.println("MyIntValue = " + myIntValue);
        //  System.out.println("MyFloat Value = " + myFloatValue);//point
        //  System.out.println("MyDoublevalue = " + myDoubleValue);//with point

        float myFloatValue = 5f / 3f;//2.5 7 digits after point
        double myDoubleValue = 5.00/  3.00;//2.5 precise answers : 16 digits after point
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloat Value = " + myFloatValue);//point
        System.out.println("MyDoublevalue = " + myDoubleValue);//with point

        //double is faster to process on many computers










    }
    
}





//double floating point Numbers

//double is larger than float in range.

//Have fractional parts expressed using decimal points
//eg.3.14159
//Floating point numbers are also known as real numbers.use floating point numbers
//when we need more precisions in calculations.

//float - single precision number
//double - double precision number

// Precision - refers to format and amount of space occupied by the type . Single precision occupies
// 32 bits(so has a width of 32) and a Double prrecision occupies 64 bits(and thus has a width of 64);