import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int price = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = n-1; i >= 0; i--){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > price){
                continue;
            }

            while(price >= arr[i]){
                price -= arr[i];
                count++;
            }

            if(price == 0){
                break;
            }
        }

        System.out.print(count);
    }
}