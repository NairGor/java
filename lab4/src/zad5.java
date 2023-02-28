import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String word = in.nextLine();
        char[] arr = word.toCharArray();
        int count =0;
        for (int i=0; i<arr.length; i++) {
            if(i==arr.length-1) {
                break;
            }
            if(arr[i] != ' ' && arr[i+1] == ' ') {
                count++;
            }
        }
        if(arr[arr.length-1] != ' ') {
            count++;

        }
        System.out.println(count);
    }
}
