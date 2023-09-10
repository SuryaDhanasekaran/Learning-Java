public class AreaCalculator {
    private static final double RETURN_MESSAGE = -1.0;

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    public static double area(double radius) {
        if (radius >= 0.0) {
            return Math.PI * radius * radius;
        } else {
            return RETURN_MESSAGE;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return RETURN_MESSAGE;
        } else {
            return x * y;
        }
    }
}
