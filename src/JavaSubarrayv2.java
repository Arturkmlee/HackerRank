import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarrayv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int soma = 0;
        n = sc.nextInt();
        int[] vetor = new int[n];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        for(int i = 0; i < vetor.length; i++){
            int count = 0;
            for(int j = i; j < vetor.length; j++){
                count += vetor[j];
                if(count < 0)
                    soma++;
            }
        }
        System.out.println(soma);
    }
}