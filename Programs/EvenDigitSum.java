public class EvenDigitSum {
    public static void main(String args[]) {
        int ans = getEvenDigitSum(2222);
        System.out.println(ans);

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = 0;
        int evenDigitSum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            number = number / 10;

        }
        return evenDigitSum;

    }
}
