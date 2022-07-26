import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            ArrayList<Integer> lista = new ArrayList<>();
            for(int j = 0; j < d; j++){
                int d2 = sc.nextInt();
                lista.add(d2);
            }
            matriz.add(lista);
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(matriz.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }

}