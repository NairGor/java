import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) ( Math.random() * 21 ) + 1;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
            if(arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.print("\n" + "Максимальное: " + max + " Минимальное: " + min + " Разность: " + (max-min));
    }
}
