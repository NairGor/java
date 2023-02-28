import java.util.Scanner;

class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b[] = new int[4];
        int count = 0;
        System.out.println(a);
        while (a > 0) {
            b[count] = a%10;
            a = a / 10;
            count++;

        }
        if ((b[0]==b[1]) || (b[0]==b[2]) || (b[0]==b[3]) || (b[1]==b[2]) || (b[1]==b[3]) || (b[2]==b[3])){
            System.out.println("Есть одинаковые цифры");
        }
        else{
            System.out.println("Нет одинаковых цифр");
        }
    }
}