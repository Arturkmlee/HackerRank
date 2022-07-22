import java.util.*;
class JavaStack{

    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            Map<Character, Integer> mapa = new HashMap<>();
            for (int i = 0; i < input.length() ; i++){
                mapa.put(input.charAt(i), mapa.get(i).intValue() + 1);
            }
        }

    }
}