import java.util.*;

public class Main{
    public static void main(String[] args){
        
        String st = ""; 
        int[] arr = new int[10001];

        for(int i=1;i<10000;i++){
            st = String.valueOf(i);
            int num = 0;

            if(st.length()== 1){
                arr[i*2]++;
            }
            else if(st.length() == 2){
                num = Integer.parseInt(st)+ (st.charAt(0)-'0')+ (st.charAt(1)-'0');
                if(num < 10000) arr[num]++;
            }
            else if(st.length() == 3){
                num = Integer.parseInt(st)+ (st.charAt(0)-'0')+ (st.charAt(1)-'0')+ (st.charAt(2)-'0'); 
                if(num < 10000) arr[num]++;
            }
            else if(st.length() == 4){
                num = Integer.parseInt(st)+ (st.charAt(0)-'0')+ (st.charAt(1)-'0')+ (st.charAt(2)-'0')+ (st.charAt(3)-'0');
                if(num < 10000) arr[num]++;
            }
        }

        for(int i=1;i<10000;i++){
            if(arr[i]==0){
                System.out.println(i);
            }
        }
    }
}