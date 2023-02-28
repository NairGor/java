import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово для перевода: ");
        String word = in.nextLine();

        switch (word){
            case "понятно":
                System.out.println("understandable");
                break;
            case "снег":
                System.out.println("snow");
                break;
            case "белый":
                System.out.println("white");
                break;
            case "клавиатура":
                System.out.println("keyboard");
                break;
            case "мышка":
                System.out.println("mouse");
                break;
            case "бумага":
                System.out.println("paper");
                break;
            case "банка":
                System.out.println("jar");
                break;
            case "обои":
                System.out.println("wallpaper");
                break;
            case "кровать":
                System.out.println("bed");
                break;
            case "майка":
                System.out.println("shirt");
                break;
            default:
                System.out.println("Такого слова нет в словаре.");
                break;
        }

    }
}
