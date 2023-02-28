public class zad5 {
    public static void main(String[] args) {
        int x = 10, y = 13, z = 42, k = 20;
        int max = x;
        int count = 0;

        if(y > max) {
            max = y;
            count = 1;
        } else if(y == max) {
            count++;
        }

        if(z > max) {
            max = z;
            count = 1;
        } else if(z == max) {
            count++;
        }

        if(k > max) {
            max = k;
            count = 1;
        } else if(k == max) {
            count++;
        }

        System.out.println(count);
    }
}
