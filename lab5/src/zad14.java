import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число: ");
            int num = in.nextInt();
            String res = "";
            int ost;
            while (num != 0) {
                ost = num % 16;
                switch (ost) {
                    case 10:
                        res = "A" + res;
                        break;
                    case 11:
                        res = "B" + res;
                        break;
                    case 12:
                        res = "C" + res;
                        break;
                    case 13:
                        res = "D" + res;
                        break;
                    case 14:
                        res = "E" + res;
                        break;
                    case 15:
                        res = "F" + res;
                        break;
                    default:
                        res = ost + res;
                        break;

                }
                num = num / 16;
            }
            System.out.println(res);
        }
    }
}
