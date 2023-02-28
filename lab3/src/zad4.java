public class zad4 {
    public static void main(String[] args) {
        int n = 7;
        int rez = 1;
        do {
            rez *= n;
            n--;
        } while (n != 0);
        System.out.println(rez);
    }
}
