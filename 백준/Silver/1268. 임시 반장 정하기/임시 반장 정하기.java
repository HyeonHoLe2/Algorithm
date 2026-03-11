import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[][] = new int[n][5];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int same[] = new int[n];
        
        for(int line=0; line<n; line++){
            for(int j=0; j<n; j++){
                if(line == j) continue;

                for(int i=0; i<5; i++){
                    if(arr[line][i] == arr[j][i]){
                        same[line]++;
                        break;
                    }
                }
            }
        }

        int maxIndex = 0;
        for(int i=1; i<n; i++){
            if(same[i] > same[maxIndex]){
                maxIndex = i;
            }
        }

        System.out.print(maxIndex + 1);
    }
}