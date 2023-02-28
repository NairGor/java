public class zad15 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int n1=4;
        int n2=4;
        for (int i=0; i<n1; i++) {
            for (int j=0; j<n2; j++) {
                arr[i][j] = (int) ( Math.random() * 9 ) + 1;
            }
        }
        for (int i=0; i<n1; i++) {
            for (int j=0; j<n2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i =0; i<n1; i+=2) {
            for (int j=0; j<n2; j++) {
                int c = arr[i][j];
                arr[i][j] = arr[i+1][j];
                arr[i+1][j] = c;
            }
        }
        System.out.println();
        for (int i=0; i<n1; i++) {
            for (int j=0; j<n2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
