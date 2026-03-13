import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String[]> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(new String[]{sc.next(), sc.next()});
        }
        
        list.sort((a,b)-> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));
        
        for(String[] s : list){
            System.out.println(s[0] + " " + s[1]);
        }
    }
}