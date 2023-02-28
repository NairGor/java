import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int x = in.nextInt();
        System.out.print("Введите число 2: ");
        int y = in.nextInt();
        System.out.println("Сложение: " + Add(x, y));
        System.out.println("Вычитание: " + Sub(x, y));
        System.out.println("Умножение: " + Mul(x, y));

    }

    public static int Add(int x, int y) {
        return x + y;
    }

    public static int Sub(int x, int y) {
        return x - y;
    }
    public static int Mul(int x, int y) {
        return x * y;
    }
}
