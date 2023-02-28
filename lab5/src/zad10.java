import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку S: ");
        String str = in.nextLine();
        System.out.print("Введите строку S0: ");
        String find = in.nextLine();

        System.out.print("Введите количество вхождений K: ");
        int k = in.nextInt();

        if (str.contains(find) && find.length() > 0) {
            char[] strArr = str.toCharArray();
            char[] findArr = find.toCharArray();
            String testStr = "";
            int countStr = findArr.length;
            int count = 0;
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] == findArr[0]) {
                    testStr = "";
                    for (int j = i; j < i + countStr; j++) {
                        testStr += strArr[j];
                    }
                    if (testStr.equals(find)) {
                        count++;
                        if (count == k) {
                            System.out.print(i + 1);
                            return;
                        }
                    }
                }
            }

            System.out.print(0);

        }
    }
}

