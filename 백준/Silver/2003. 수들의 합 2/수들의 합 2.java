import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int left = 0;
        int sum = 0;
        int count = 0;
        
        for(int right = 0; right < n; right++){
            
            sum += arr[right];
            
            while(sum > m){
                sum -= arr[left];
                left++;
            }
            
            if(sum == m){
                count++;
            }
        }
        
        System.out.println(count);
    }
}