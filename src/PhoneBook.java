//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class PhoneBook{
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> mapa = new HashMap<>();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            mapa.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()) {
            String s = in.nextLine();
            if (mapa.containsKey(s)){
                System.out.println(s + "=" + mapa.get(s));
            } else{
                System.out.println("Not found");
            }
        }
    }

}