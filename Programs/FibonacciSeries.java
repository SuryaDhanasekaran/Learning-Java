public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Change this value to generate a different number of terms in the series

        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);
    }

    static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
