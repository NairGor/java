import java.util.Scanner;
public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int direct = scanner.nextInt();
        int n = scanner.nextInt();
        String result = "";
        switch (direct) {
            case (11):
                switch (n) {
                    case 1 -> result = "Запад";
                    case 0 -> result = "Север";
                    case -1 -> result = "Восток";
                }
                break;
            case (12):
                switch (n) {
                    case 1 -> result = "Юг";
                    case 0 -> result = "Запад";
                    case -1 -> result = "Север";
                }
                break;
            case (13):
                switch (n) {
                    case 1 -> result = "Восток";
                    case 0 -> result = "Юг";
                    case -1 -> result = "Запад";
                }
                break;
            case (14):
                switch (n) {
                    case 1 -> result = "Север";
                    case 0 -> result = "Восток";
                    case -1 -> result = "Юг";
                }
                break;
        }
        System.out.println("Позиция робота: " + result);

    }
}
