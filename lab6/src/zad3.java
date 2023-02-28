public class zad3 {
    public static void main(String[] args) {
        double x = 12, y = 10;
        System.out.println("Минимальное: " + min(min(2 * x, Math.abs(x - y)), min(4.5, (x + y) / 3)));
    }

    public static double min(double x, double y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}
