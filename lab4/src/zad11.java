import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String word = in.nextLine();
        char[] arr = new char[] {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        char[] arrWord = word.toCharArray();
        int count = 0;
        for (int i=0; i<arrWord.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if (arrWord[i]==arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Процент вхождения гласных: " + (double)count/arrWord.length*100);
    }
}
