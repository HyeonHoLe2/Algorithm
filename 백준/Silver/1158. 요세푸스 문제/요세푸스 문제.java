import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        List<Integer> list = new ArrayList<>(); 
        
        for(int i =1;i<=n;i++){
            list.add(i);
        }
        
        int point = 0;
        int[] arr = new int[n]; 
        
        for(int i =0;i<n;i++){
            
            point = (point + k - 1) % list.size();
            
            arr[i] = list.remove(point);
        }
        
        System.out.print("<");
        for(int i=0; i<n;i++){
            if(i==n-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(">");
    }
}