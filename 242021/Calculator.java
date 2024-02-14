import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        double firstNumber = scanner.nextDouble();

        System.out.println("Enter your second number: ");

        double secondNumber = scanner.nextDouble();

        double answer = firstNumber + secondNumber;

        System.out.println("The answer is " + answer);


    }
    
}
