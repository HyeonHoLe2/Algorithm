import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer[]> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            list.add(new Integer[]{sc.nextInt(), sc.nextInt()});
        }
        
        list.sort((a,b) -> {
            if(a[1].equals(b[1])){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        
        for(int i = 0; i < n; i++){
            System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
        }
    }
}