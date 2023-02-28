import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {

            arr[i] = in.nextInt();
        }

        boolean order = true;

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]<arr[i+1]) {
                order = false;
                break;
            }
        }
        if (order==false) {
            order=true;
            for (int i=0; i<arr.length-1; i++) {
                if (arr[i]>arr[i+1]) {
                    order = false;
                    break;
                }
            }
        }
        if(order == false) {
            System.out.println("Неупорядоченный");
        } else {
            System.out.println("Упорядоченный");
        }

    }
}
