import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ С: ");
        String c = in.nextLine();
        String[] strings = new String[5];
        for(int i=0; i<5; i++) {
            System.out.print("Введите строку " + (i+1) + ": ");
            strings[i] = in.nextLine();
        }

        for(int i=0; i<5; i++) {
            int index = strings[i].indexOf(c);
            if (index!=-1) {
                strings[i] = strings[i].substring(0, index) + strings[i].substring(index+1);
            }
            System.out.println(strings[i]);
        }

    }
}
