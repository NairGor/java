import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        System.out.print("Введите индекс символа: ");
        int k = in.nextInt();
        char[] arr = s.toCharArray();
        System.out.print("Введите количество символов: ");
        int n = in.nextInt();
        String res = "";

        if (k>s.length()) {
            System.out.println("0");
        } else {
            for(int i=k; i<s.length(); i++) {
                if(k+n == i) {
                    break;
                }
                res = arr[i] + res;
            }
        }
        System.out.println(res);

    }
}

