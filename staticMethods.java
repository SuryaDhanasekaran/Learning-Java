class calculator {
    
    public static void printSum(int a,int b) {

        System.out.println("sum= " + (a+b));
        
    }
}

public class staticMethods{

    public static void main(String[] args) {
        
        calculator.printSum(5, 10);
        printHello();
    }

    public static void printHello() {
        
        System.out.println("Hello");
        
    }

}