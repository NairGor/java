import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String word = in.nextLine();
        char[] arr = word.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>='а' && arr[i]<='я') {
                String c = "" + arr[i];
                c =c.toUpperCase();
                arr[i] = c.toCharArray()[0];
            }
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
