import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        
        while((line = br.readLine()) != null){
            
            if(line.equals(".")) break; 
            
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for(int i=0;i<line.length();i++){
                char ch = line.charAt(i);
                
                if(ch == '(' || ch == '['){
                    stack.push(ch);
                }
                else if(ch == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
                else if(ch == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if(isValid && stack.isEmpty()){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}