import java.util.*;

public class Main{

    static Map<Integer, List<Integer>> map = new HashMap<>();
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int com = sc.nextInt();
        int t_case = sc.nextInt();
        
        visited = new boolean[com + 1];
        
        for(int i = 0; i < t_case; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();

            map.putIfAbsent(key, new ArrayList<>());
            map.putIfAbsent(value, new ArrayList<>());

            map.get(key).add(value);
            map.get(value).add(key);
        }
        
        recur(1);
        System.out.print(count);
    }

    static void recur(int n){
        visited[n] = true;

        for(int num : map.getOrDefault(n, new ArrayList<>())){
            if(!visited[num]){
                count++;
                recur(num);
            }
        }
    }
}