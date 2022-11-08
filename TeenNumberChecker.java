public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean ans = hasTeen(22, 23, 34);
        System.out.println(ans);

    }

    public static boolean hasTeen(int one, int two, int three) {
        if (isTeen(one) || isTeen(two) || isTeen(three)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen(int a) {
        if (!(a >= 13 && a <= 19)) {
            return false;
        } else {
            return true;
        }

    }
}
