public class zad2 {
    public static void main(String[] args) {
        double x = 12, y = 10;
        System.out.println("Минимальное: " + min(x+y, min(x*y, 0.5)));
    }

    public static double min(double x, double y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}
