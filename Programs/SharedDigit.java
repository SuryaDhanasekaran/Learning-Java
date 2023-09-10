public class SharedDigit {
    public static void main(String[] args) {
        boolean ans = hasSharedDigit(100, 10);
        System.out.println(ans);

    }

    public static boolean hasSharedDigit(int numa, int numb) {
        if ((numa <= 10 && numa <= 99) || (numb <= 10 && numb <= 99)) {
            return false;
        }
        int lefta = numa / 10;
        int righta = numa % 10;
        int leftb = numb / 10;
        int rightb = numb % 10;
        while (lefta == leftb || lefta == rightb || righta == leftb || righta == rightb) {
            return true;
        }
        return false;

    }

}
