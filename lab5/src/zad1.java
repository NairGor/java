import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String word = in.nextLine();
        char[] arr = word.toCharArray();
        boolean ident = true;
        if(word.length()==0) {
            System.out.println("-1");
            ident=false;
        } else if (arr[0]>='0' && arr[0]<='9') {
            System.out.println("-2");
            ident=false;
        } else {

            for (int i=0; i< arr.length; i++) {
                if (!((arr[i]>='A' && arr[i]<='Z') || (arr[i]>='a' && arr[i]<='z') || arr[i]=='_' || (arr[i]>='0' && arr[i]<='9'))) {
                    System.out.println(i+1);
                    ident=false;
                    break;
                }
            }
        }
        if(ident==true) {
            System.out.println('0');
        }

    }
}
