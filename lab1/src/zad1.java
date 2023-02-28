public class zad1 {
    public static void main(String[] args) {
        int x=10, y=12, z=3;
        System.out.println(x += y - x++ * z);
        x=10; y=12; z=3;
        System.out.println(z= --x - y*5);
        x=10; y=12; z=3;
        System.out.println(y /= x + 5 % z);
        x=10; y=12; z=3;
        System.out.println(z = x++ + y * 5);
        x=10; y=12; z=3;
        System.out.println(x = y - x++ * z);

    }

}
