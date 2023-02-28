import java.util.Locale;
import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число: ");
            String str = in.nextLine();
            str = str.toUpperCase(Locale.ROOT);
            char[] arr = str.toCharArray();
            int res = 0;

            for (int j = arr.length - 1; j >= 0; j--) {
                switch (arr[j]) {
                    case 'A':
                        res += 10 * Math.pow(16, arr.length - 1 - j);
                        break;
                    case 'B':
                        res += 11 * Math.pow(16, arr.length - 1 - j);
                        break;
                    case 'C':
                        res += 12 * Math.pow(16, arr.length - 1 - j);
                        break;
                    case 'D':
                        res += 13 * Math.pow(16, arr.length - 1 - j);
                        break;
                    case 'E':
                        res += 14 * Math.pow(16, arr.length - 1 - j);
                        break;
                    case 'F':
                        res += 15 * Math.pow(16, arr.length - 1 - j);

                        break;
                    default:
                        res += Integer.parseInt(String.valueOf(arr[j])) * Math.pow(16, arr.length - 1 - j);
                        break;
                }
            }
            System.out.println(res);
            res = 0;

        }
    }
}
