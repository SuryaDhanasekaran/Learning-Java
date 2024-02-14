// public class Logical {

//     public static void main(String[] args) {

//         int age = 45;

//         boolean voting_registered = true;

//         if (age >= 18) {

//             if(voting_registered){
                
//                 System.out.println("You are eligible to vote");
//         }
//         else
//         {
//             System.out.println("You are not eligible to vote");
//         }
//     }
//     else
//     {
//         System.out.println("You are not eligible to vote");
//     }
// }
// }

public class Logical {
    public static void main(String[] args) {
        int age = 45;
        boolean voting_registered = true;

        //&& is a logical AND operator
        //|| is a logical OR operator
        //! is a logical NOT operator
        //== is a comparison operator
        //!= is a comparison operator
        //< is a comparison operator
        //<= is a comparison operator
        //> is a comparison operator
        //>= is a comparison operator
        //& is a bitwise AND operator
        //| is a bitwise OR operator
        //^ is a bitwise XOR operator
        //! is a bitwise NOT operator
        //<< is a bitwise left shift operator
        //>> is a bitwise right shift operator
        //>>> is a bitwise right shift operator with zero fill

        if(age >= 18 && voting_registered){
            System.out.println("You are eligible to vote");
        }
    }
}
