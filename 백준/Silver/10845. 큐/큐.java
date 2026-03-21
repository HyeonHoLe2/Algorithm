import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception { 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String token = st.nextToken(); 
           
            if(token.equals("push")){
                deque.offer(Integer.parseInt(st.nextToken()));
            } 
            
            else if(token.equals("pop")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.poll()).append("\n");
                }
            }
            
            else if(token.equals("size")){
                sb.append(deque.size()).append("\n");
            }
            
            else if(token.equals("empty")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            
            else if(token.equals("front")){
                if(!deque.isEmpty()){
                    sb.append(deque.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            
            else if(token.equals("back")){
                if(!deque.isEmpty()){
                    sb.append(deque.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }    
        }
        System.out.print(sb);
    }
}