public class zad6 {
    public static void main(String[] args) {
        int x = 10, y = 13, z = 42, k = 20, l = -10;
        int max = x, min = x;
        int count = 0;

        if(y > max)
            max = y;

        if(y < min)
            min = y;

        if(z > max)
            max = z;

        if(z < min)
            min = z;

        if(k > max)
            max = k;

        if(k < min)
            min = k;

        if(l > max)
            max = l;

        if(l < min)
            min = l;

        System.out.println(min + " " + max);
    }
}