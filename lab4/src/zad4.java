public class zad4 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                arr[i][j] = (int) (Math.random() * 8) + 1;
            }
        }
        int sumX=0;
        int max = arr[0][0];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(arr[i][j] + " ");
                sumX+=arr[i][j];
                if(arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
            System.out.print("       " + sumX);
            sumX=0;
            System.out.println();
        }
        int prY = 1;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<10; j++) {

                prY*=arr[j][i];
            }
            System.out.print(prY + " ");
            prY=1;
//            System.out.println();
        }
        System.out.println("\nМаксимальный элемент главной диагонали: " + max);

    }
}

