import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String word = in.nextLine();
        char[] arr = word.toCharArray();
        String reverseWord = "";
        for(int i=arr.length-1; i>=0; i--) {
            reverseWord+=arr[i];
        }
//        System.out.print(word + " " + reverseWord);
        if(word.equals((reverseWord))) {
            System.out.print("Палиндром");
        } else {
            System.out.print("Не палиндром");
        }
    }
}
