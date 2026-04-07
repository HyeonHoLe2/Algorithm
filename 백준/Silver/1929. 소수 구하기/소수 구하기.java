import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        
        boolean[] isPrime = new boolean[end + 1];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i * i <= end; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= end; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        for(int i = start; i <= end; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }
}