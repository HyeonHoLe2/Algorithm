import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            A.add(sc.nextInt());
        }
        
        for(int i = 0; i < m; i++){
            B.add(sc.nextInt());
        }
        
        int count = 0;
        
        for(int x : A){
            if(B.contains(x)){
                count++;
            }
        }
        
        int result = (n + m) - (count * 2);
        
        System.out.println(result);
    }
}