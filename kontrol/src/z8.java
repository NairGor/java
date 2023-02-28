import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class z8 {
    public static void main(String[] args) {
        int SymbolLength = (int)(Math.random()*7)+1;
        String symbol = "qwertyuiopasdfghjkl;'zxcvb@#$%^";
        ArrayList<Character> line = new ArrayList<Character>();
        Random r = new Random();
        line.add('!');
        line.add('!');

        for (int i = 0; i < SymbolLength; i++)
        {
            char c = symbol.charAt(r.nextInt(symbol.length()));
            line.add(c);
        }
        Collections.shuffle(line);
        String str = line.toString().replaceAll(", |\\[|\\]", "");
        System.out.println("Сгенерированная строка: " + str);
    }
}