import java.lang.reflect.Array;
import java.util.*;
public class JavaStackFinal{

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            boolean resultado = true;
            String input = sc.next();
            List<String> lista = new ArrayList<>(Arrays.asList(input.split("")));
            int chave = 0;
            int colchete = 0;
            int parenteses = 0;
            for(String c: lista){
                if (c.contentEquals("{"))
                    chave++;
                else if(c.contentEquals("["))
                    colchete++;
                else if(c.contentEquals("("))
                    parenteses++;
                else if(c.contentEquals("}") && chave > 0)
                    chave--;
                else if(c.contentEquals("]") && colchete > 0)
                    colchete--;
                else if(c.contentEquals(")") && parenteses > 0)
                    parenteses--;
                else
                    resultado = false;
            }
            if(parenteses > 0 || chave > 0 || colchete > 0)
                resultado = false;
            System.out.println(resultado);
        }

    }
}