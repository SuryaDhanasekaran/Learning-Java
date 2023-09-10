public class NumberPalindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(124);
        System.out.println(ans);

    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            int Digit = stored % 10;
            reverse = (reverse * 10) + Digit;
            stored /= 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

}
