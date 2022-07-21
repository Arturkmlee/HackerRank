import java.util.Scanner;

public class JavaStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String current = s.substring(0, k);
        String smallest = current;
        String largest = current;
        for (int i = 1; i <= s.length() - k; i++){
            current = s.substring(i, (i + k));
            if(current.compareTo(smallest) < 0)
                smallest = current;
            if(current.compareTo(largest) > 0)
                largest = current;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s;
        int k;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
}

