import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        sc.nextLine();
        
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            set.add(sc.nextLine());
        }
        
        for(int i=0;i<m;i++){
            String str = sc.nextLine();
            
            if(set.contains(str)){
                list.add(str);
            }
        }
       list.sort(null);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        
        }
    }
}