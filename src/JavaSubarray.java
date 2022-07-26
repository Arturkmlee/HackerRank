import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int soma = 0;
        n = sc.nextInt();
        int[] vetor = new int[n];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        int count = 1;
        while (count <= vetor.length){
            for(int i = 0; i < vetor.length; i++){
                int[] aux = Arrays.copyOfRange(vetor, i, i + count);
                if(i + count > vetor.length)
                    break;
                int sum = 0;
                for(int j: aux)
                    sum += j;
                if (sum < 0)
                    soma++;
            }
            count++;
        }
        System.out.println(soma);
    }
}