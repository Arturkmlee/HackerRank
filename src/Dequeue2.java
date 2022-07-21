import java.util.*;
// NAO FUNCIONA
public class Dequeue2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> setMapa = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            setMapa.add(num);

            if(i > m - 1){
                if(setMapa.size() > max){
                    max = setMapa.size();;
                }
                int remove = deque.removeFirst();
                if (!deque.contains(remove))
                    setMapa.remove(remove);
            }
        }
        System.out.println(max);
    }
}



