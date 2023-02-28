import java.util.Scanner;

class z2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String text = String.valueOf(N);
        text = text.substring(text.length()-1)+text.substring(1, text.length()-1)+text.substring(0, 1);
        N = Integer.parseInt(text);
        System.out.println(N);
    }
}