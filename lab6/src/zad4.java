public class zad4 {
    public static void main(String[] args) {
        double x = 12, y = 10;
        double z = max(x, 2 * y - x) - max(5 * x + 3 * y, y);
        System.out.print(z);

    }

    public static double max(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
