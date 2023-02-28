import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) ( Math.random() * 40 ) - 20;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int count=0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]<-10 || arr[i]>10) {
                count++;
            }
        }
        System.out.print("\n" + count);
    }
}
