public class zad10 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                arr[i][j] = (int) ( Math.random() * 20 ) + -9;
            }
        }

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.print("Координаты нулевых элементов: ");
        int countNeg = 0;
        int countPos = 0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (arr[i][j]<0) {
                    countNeg++;
                } else if(arr[i][j]>0) {
                    countPos++;
                } else {
                    System.out.print(i + ";"+ j+" ");
                }
            }
        }
        System.out.println("\nКоличество положительных: " + countPos + "; Количество отрицательных: "+countNeg);
    }
}
