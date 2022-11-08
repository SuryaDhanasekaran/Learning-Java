public class PlayingCat {

    public static void main(String[] args) {
        boolean ans = isCatPlaying(false, 35);
        System.out.println(ans);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }

    }
}
