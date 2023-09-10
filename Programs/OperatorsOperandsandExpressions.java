public class OperatorsOperandsandExpressions {
    public static void main(String args[])
    {
        int result = 1 + 2; // 1 + 2 = 3

        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("PreviousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("PreviousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println(" 20 / 5 = " + result);

        result = result % 3;//the remainder of (4 % 3 )= 1
        System.out.println(" 4 % 3 = " + result);

        //result = result + 1;
        result++;// 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println(" 2 - 1 = " + result);

        //result = result +2;

        result += 2;// 1 + 2 = 3
        System.out.println("1 + 2 = " + result);



        //result = result * 10
        result *= 10;// 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;// 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2

        result -= 1;// 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        //result = result %  2

        result %= 2;
        System.out.println(" 8 % 2 =" + result);






    }
    
}




/*
 * Operators in java are special symbols that perform specific operations on one,two or three operands, and 
 * then return a result. As an example,we used the +(addition) operator to sum the value of two 
 * variables in a previous video.
 * 
 * Operand:
 *      An operand is a term used to describe any object that is manipulated by an operator.If
 *   we consider this statement int myVar = 15 + 12;
 * 
 *      Then + is the operator and 5 and 12 are the operands.Variables used instead of literals are 
 * also operands.
 * 
 * double mySalary = houseWorked * hourlyRate;
 * 
 * In the above line hoursWorked and hourlyRate are operands and *(multiplication) is the operator.
 */

 /*
  * EXPRESSIONS:
       An expression is formed by combining variables,literals,methods return values(which we haven't covered yet)
       and operators.
  */
