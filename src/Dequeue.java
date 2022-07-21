import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> mapaHash = new HashMap<Integer, Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if(mapaHash.containsKey(num)){
                mapaHash.put(num, mapaHash.get(num).intValue() + 1);
            } else {
                mapaHash.put(num, 1);
            }

            if(i >= m){
                int valorDeque = deque.removeFirst();
                int valorMapa = mapaHash.get(valorDeque);
                if(valorMapa == 1){
                    mapaHash.remove(valorDeque);
                } else {
                    mapaHash.put(valorDeque, valorMapa - 1);
                }
            }
            int tamanho = mapaHash.size();
            if (max < tamanho){
                max = tamanho;
            }
        }
        System.out.println(max);
    }
}



