import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String[] words = str.split(" ");
        System.out.print("Введите номер слова: ");
        int n = in.nextInt();
        System.out.println(words[n - 1]);

    }

}
