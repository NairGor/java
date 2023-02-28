import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размерность: ");
        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 15) - 5;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;
        System.out.println("\nНечетные:");
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min) {
                min = a[i];
            }
            if(a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
            sum += a[i];

        }
        System.out.println("\nМаксимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (double)sum/n);
    }
}
