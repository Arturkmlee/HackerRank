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
        sc.nextLine();
        while(q-- > 0){
            String query = sc.nextLine();
            if (query.contentEquals("Delete")){
                int y = sc.nextInt();
                l.remove(y);
            } else if (query.contentEquals("Insert")){
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                l.add(x, y);
            }
            sc.nextLine();
        }
        System.out.println(l);
    }
}