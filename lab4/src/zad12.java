import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) ( Math.random() * 500 ) - 300;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int count=0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>-100 && arr[i]<100) {
                count++;
            }
        }
        System.out.print("\n" + count);
    }
}
