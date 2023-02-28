public class zad4 {
    public static void main(String[] args) {
        int x = 10, y = 13, z = 42, k = 20;
        if (x < y && x < z && x < k){System.out.println(x);}
        else if (y < x && y < z && y < k){System.out.println(y);}
        else if (z < x && z < y && z < k){System.out.println(z);}
        else if (k < y && k < z && k < x){System.out.println(k);}
    }
}
