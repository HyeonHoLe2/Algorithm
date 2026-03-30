import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new ArrayDeque<>();
        int last = 0; 
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            
            switch(cmd){
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    q.offer(x);
                    last = x;
                    break;
                    
                case "pop":
                    if(q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.poll()).append("\n");
                    break;
                    
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                    
                case "empty":
                    sb.append(q.isEmpty() ? "1\n" : "0\n");
                    break;
                    
                case "front":
                    if(q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peek()).append("\n");
                    break;
                    
                case "back":
                    if(q.isEmpty()) sb.append("-1\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }
        
        System.out.print(sb);
    }
}