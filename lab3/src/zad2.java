public class zad2 {
    public static void main(String[] args) {
        int a = 2, b = 7;
        int sum = 0;

        for (int i = a + 1; i < b; i++)
            sum += i;
        System.out.println("Сумма: " + sum);

        System.out.print("Нечетные числа: ");
        for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
