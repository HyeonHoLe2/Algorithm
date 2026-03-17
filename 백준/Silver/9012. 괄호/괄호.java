import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
       
    
       
       for(int test=0;test<n;test++){
          String str = sc.nextLine();
          int count = 0;
          char ch = ' ';
        
            for(int i=0; i<str.length(); i++){
          
           
                if(str.charAt(i) == '('){
                    count++;
                }
                else if(str.charAt(i) == ')'){
                    count--;
                }
                
                if(count<0){
                  break;
                }
            }
            
           if(count ==0 ){
            System.out.println("YES");
           }
           else{  
            System.out.println("NO");
           }
        }
    
    
}
}