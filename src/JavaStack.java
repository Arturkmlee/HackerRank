import java.util.*;
class JavaStack{

    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            boolean result = true;
            Map<Character, Integer> mapa = new HashMap<>(Map.of('{',0,
                    '}',0,
                    '(',0,
                    ')',0,
                    '[',0,
                    ']',0));
            for(int i = 0; i < input.length(); i++){
                mapa.put(input.charAt(i), mapa.get(input.charAt(i)) + 1);
            }

            if(mapa.get('{') - mapa.get('}') != 0)
                result = false;
            if(mapa.get('(') - mapa.get(')') != 0)
                result = false;
            if(mapa.get('[') - mapa.get(']') != 0)
                result = false;

            System.out.println(result);

        }

    }
}