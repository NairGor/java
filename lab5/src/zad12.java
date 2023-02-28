import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String[] words = str.split(" ");
        int n = 0;
        String[] var5 = words;
        int var6 = words.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String c = var5[var7];
            System.out.println(c);
            ++n;
        }

        System.out.println("Количество слов: " + n);

    }
}
