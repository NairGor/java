public class zad3 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i >= j) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        System.out.println();

        int num = 12;
        for (int i = 1; i < num / 2; ++i){

            for (int j = num / 2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
        System.out.println();

        for (int i = 1; i < num / 2; ++i){

            for (int j = num / 2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
        for (int i = num/2; i >= 1; --i){

            for (int j = num/2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < i * 2; ++j)
                System.out.print("*");

            System.out.println();
        }
    }
}
