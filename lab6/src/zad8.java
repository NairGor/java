import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        int x = getInt();
        int y = getInt();
        char oper = getOperation();
        System.out.println(calc(x, y, oper));
    }

    public static int getInt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        return x;
    }

    public static char getOperation() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите операцию +, -, * или /: ");
        char x = in.nextLine().toCharArray()[0];
        return x;
    }

    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                if(num2!=0) {
                    return num1/num2;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }

}
