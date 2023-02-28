import java.util.Scanner;
public class z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Делители данного числа: ");
        for (int i = 1; i<=n ; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}