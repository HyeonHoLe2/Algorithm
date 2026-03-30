import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] A = new int[n];
        int[] B = new int[n];
        
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        
        Integer[] B2 = new Integer[n];
        for(int i=0;i<n;i++){
            B2[i] = B[i];
        }
        
        Arrays.sort(B2, Collections.reverseOrder()); 
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += A[i] * B2[i];
        }
        
        System.out.println(sum);
    }
}