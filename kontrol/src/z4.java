import java.util.Scanner;
public class z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i<=n ; i++){
            summ += i;
        }
        System.out.println("Сумма чисел от 1 до N = " + summ);
    }
}
