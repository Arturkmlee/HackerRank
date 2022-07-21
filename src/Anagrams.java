import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] a2 = a.toCharArray();
        char[] b2 = b.toCharArray();
        Arrays.sort(a2);
        Arrays.sort(b2);
        return Arrays.equals(a2, b2)?true:false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}