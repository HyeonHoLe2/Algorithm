import java.util.*;

public class Main{
    public static void main(String[] args){
       
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Deque<Integer> deque = new ArrayDeque<>();
        int value = 0;
        int sum = 0;
        for(int i=0; i<n;i++){
            value = sc.nextInt();
 
            if(value == 0){
               if(!deque.isEmpty()){
                 sum -= deque.poll();
                 continue;
               }
            }
           
            sum += value;
            deque.push(value);
            
        }
        System.out.print(sum);
        
    }
}