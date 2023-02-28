public class zad6 {
    public static void main(String[] args) {
        int[][] arr = createArray(5, 4);
        printArray(arr);

    }

    public static int[][] createArray(int h, int w) {
        int[][] arr = new int[h][w];
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                arr[i][j] = (int) ( Math.random() * 9 ) + 1;
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
