public class zad5 {
    public static void main(String[] args) {
        System.out.print(f(6)/2 + f(13)/2 + f(21)/2);
    }

    public static double f(double n) {
        return Math.sqrt(n) + n;
    }
}
