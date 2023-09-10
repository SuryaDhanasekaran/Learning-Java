public class IfThenStatement {
    public static void main(String args[])
    {
        boolean isAlien = false;//= assignment operator 
        if(isAlien == false)//if statement does not have semicolons at end
        {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");


        }//code blocks must be used
         //Logical and Operator
        int topScore = 80;
        if (topScore == 100){ //>,>=,==,!=,<,<=,
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        //OR - any one is true
        if((topScore > 90)||(secondTopScore <= 90))
        {
            System.out.println("Either or both conditions are true");
    
        }

        int newValue = 50;
        if(newValue == 50)
        {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar){//==,!,=
            System.out.println("This is not supposed to happen");
        }
        /*
         * Ternary Operator
         * 
         * The ternary operator is a shortcut to assigning one of two values to a variable depending on a given
         * condition.
         * 
         * eg:
         * int ageOfClient = 20;
         * 
         * boolean isEighteenOrOver = (ageOfClient == 20)? true : false;
         */
        isCar = true;
        boolean wasCar = isCar ? true : false;
        
        if(wasCar)
        {
            System.out.println("WasCar is true");
        }

        //https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html


        
    }
    
}

//Logical AND and LOgical OR
/*
 * The AND operator comes in two flavors in Java,done the OR operator.
 * && is the Logical AND which operates on boolean operands - Checking if a given condition is true or false.
 * 
 * & | - bitwise operator 
 */

/*
 * The if-then statement is the most basic of all the control flow statement. It tells your program to execute
 * a certain section of code only if a particular test evaluates to true.
 * 
 * This is known conditional logic.
 * 
 * Conditional logic uses specific statements in java to allow us to check a codition and execute certain
 * code based on whether the condition(the expression) is true or false.
 * 
 * code block:
 *      A code block allows more than one statement to be executed . 
 * 
 * if(expression)
 * {
 * //statements
 * }
 * 
 * //The NOT operator is also known as the Logical Complement Operator.
*/
