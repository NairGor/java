import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку S: ");
        String s = in.nextLine();
        System.out.print("Введите строку S0: ");
        String s0 = in.nextLine();

        int index = s.lastIndexOf(s0);
        if(index!=-1) {
            System.out.println(index);
        } else {
            System.out.println("Не содержит");
        }

    }
}

