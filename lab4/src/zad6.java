import java.util.Arrays;

public class zad6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int countEven = 0;
        int countOdd = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) ( Math.random() * 10 ) + 1;
            if(arr[i]%2==0) {
                countEven++;
            } else if(arr[i]%2!=0) {
                countOdd++;
            }
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] chetn = new int[countEven];
        int[] nechetn = new int[countOdd];
        int iEven=0;
        int iOdd=0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) {
                chetn[iEven] = arr[i];
                iEven++;
            } else if(arr[i]%2!=0) {
                nechetn[iOdd] = arr[i];
                iOdd++;
            }
        }
        Arrays.sort(chetn);
        Arrays.sort(nechetn);

        System.out.println("\nЧетные:");
        for (int i=0; i<chetn.length; i++) {
            System.out.print(chetn[i] + " ");
        }
        System.out.println("\nНечетные:");
        for (int i=0; i<nechetn.length; i++) {
            System.out.print(nechetn[i] + " ");
        }


    }
}

