public class zad1 {
    public static void main(String[] args) {
        double x = 12, y = 10;
        System.out.println("Минимальное: " + min(x, y));
    }

    public static double min(double x, double y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}
