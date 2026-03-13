import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        String result = "";
        int arr[] = new int[n.length()];
        
        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);
            arr[i]= ch - '0';
        }
        
        Arrays.sort(arr);
      
        for(int i = arr.length - 1; i >= 0; i--){
              result += (char)(arr[i] + '0');
        }

        System.out.print(result);
    }
}