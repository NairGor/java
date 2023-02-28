import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку S: ");
        String s = in.nextLine();
        System.out.print("Введите строку S0: ");
        String s0 = in.nextLine();
        System.out.print("Введите индекс символа K: ");
        int k = in.nextInt();
        char[] arr = s.toCharArray();
        char[] arr0 = s0.toCharArray();
        s= s.substring(k);
        if (k>s.length()) {
            System.out.println(0);
            return;
        }
        int index = s.indexOf(arr0[0]);
        arr = s.toCharArray();
        if (index == -1) {
            System.out.println(0);

        } else {
            boolean flag = true;
            int c=0;
            for (int i=index; i<s.length(); i++) {
                if (i == s0.length()) {
                    break;
                }
                if (arr[i] != arr0[c]) {
                    flag = false;
                    break;
                }
                c++;

            }
            if(flag == false) {
                System.out.println(0);
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }

    }
}
