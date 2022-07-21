import java.util.*;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = "";
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        for (int i = 0; i < A.length(); i++){
            char c = A.charAt(i);
            reverse = c + reverse;
        }
        System.out.println((reverse.contentEquals(A))?"Yes":"No");
    }
}



