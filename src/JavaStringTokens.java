import java.lang.reflect.Array;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] resultado = s.split(" ");
        for (String value : resultado) {
            System.out.println(value);
        }
        scan.close();
    }
}

