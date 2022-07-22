import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
           l.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++){
            String query = sc.next();
            if (query.contentEquals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(x, y);
            } else {
                int x = sc.nextInt();
                l.remove(x);
            }
        }
        for (int i: l){
            System.out.print(i + " ");
        }
    }
}