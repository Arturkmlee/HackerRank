import java.util.*;

public class Java1dArray {

    public static boolean canWin(int leap, int[] game) {
        boolean jump = false;
        int pivot = 0;
        for(int i = 0; i < game.length; i++){
            if(jump){
                if(pivot + leap >= game.length - 1)
                    return true;
                else if (game[pivot + leap] == 1)
                    return false;

                jump = false;
                i = pivot + leap - 1;
            }
            else if(game[i] == 1) {
                jump = true;
            }
            else {
                pivot = i;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}