public class zad8 {
    public static void main(String[] args) {
        int[] M = new int[10];
        for (int i=0; i<M.length; i++) {
            M[i] = (int) ( Math.random() * 200 ) + 1;
        }
        for (int i=0; i<M.length; i++) {
            System.out.print(M[i] + " ");
        }
        int count=0;
        for (int i=0; i<M.length; i++) {
            if(M[i]>0 && M[i]<125) {
                count++;
            }
        }
        System.out.print("\n" + count);

    }
}
