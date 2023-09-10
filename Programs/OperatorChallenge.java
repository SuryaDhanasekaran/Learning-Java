public class OperatorChallenge {

    public static void main(String args[])
    {
        double myfirstDouble = 20.00d;
        double mysecondDouble = 80.00d;
        double addndMultiply = (myfirstDouble + mysecondDouble) * 100.00d;
        System.out.println(addndMultiply);
        double remainderResult =  addndMultiply % 40.00d;
        System.out.println(remainderResult);
        boolean isNoRemainder =(remainderResult == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder)
        {
            System.out.println("Got some remainder");
        }
        
        

    }
    
}
