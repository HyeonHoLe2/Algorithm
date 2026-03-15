import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer[]> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            list.add(new Integer[]{sc.nextInt(), sc.nextInt()});
        }
        
        for(int i = 0; i < n; i++){
            int rank = 1;
            
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                
                if(list.get(i)[0] < list.get(j)[0] &&
                   list.get(i)[1] < list.get(j)[1]){
                    rank++;
                }
            }
            
            System.out.print(rank + " ");
        }
    }
}