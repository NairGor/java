import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите шаблон: ");
        String pattern = in.nextLine();
        System.out.print("Введите размерность: ");
        int n = in.nextInt();
        String word = "";
        int count = n/pattern.length()+1;
        for(int i=0; i<count; i++) {
            word+=pattern;
        }
        word = word.substring(0, n);
        System.out.println(word);
    }
}
