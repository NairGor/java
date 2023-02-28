import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        int count=1;
        String res = "";
        for(int i=0; i<arr.length; i++) {
            if (i+1 ==arr.length || arr[i] != arr[i+1]) {

                if (count>4) {
                    res += arr[i] + "{" + count + "}";

                } else {
                    for (int j=0; j<count; j++) {
                        res += arr[i];
                    }
                }
                count =1;
                continue;
            }
            if (arr[i] == arr[i+1]) {
                count++;
                continue;
            }

        }
        System.out.println(res);
    }
}
