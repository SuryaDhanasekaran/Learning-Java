public class PerfectNumber {
    public static void main(String[] args) {
        boolean num = isPerfectNumber(6);
        System.out.println(num);

    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number > 1;

    }
}
