import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double a = in.nextDouble();
        if (a < 0 || a > 100) {
            System.out.println("Не входит никуда");
        } else if(a >= 0 && a <= 14) {
            System.out.println("Входит в 0-14");
        } else if(a >= 15 && a <= 35) {
            System.out.println("Входит в 15-35");
        } else if(a >= 36 && a <= 49) {
            System.out.println("Входит в 36-49");
        } else if(a >= 50 && a <= 100) {
            System.out.println("Входит в 50-100");
        }
        else
            System.out.println("Число не входит ни в один из промежутков.");
    }
}
