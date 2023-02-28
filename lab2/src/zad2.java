import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        double operand1 = 100, operand2 = 2;
        Scanner in = new Scanner(System.in);
        System.out.print("Даны числа: 100, 2 \nВведите операцию (+, -, *, /): ");
        String word = in.nextLine();
        switch (word){
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if(operand2 == 0) {
                    System.out.println("На нуль делить нельзя.");
                    break;
                }
                System.out.println(operand1 / operand2);
                break;
            default:
                System.out.println("Такой операции нет.");
        }
    }
}
