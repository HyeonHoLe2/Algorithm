import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[n][5];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int result = 0;

        for(int i=0;i<n;i++){
            int count = 0;

            for(int j=0;j<n;j++){
                if(i == j) continue;

                for(int k=0;k<5;k++){
                    if(arr[i][k] == arr[j][k]){
                        count++;
                        break;
                    }
                }
            }

            if(count > max){
                max = count;
                result = i;
            }
        }

        System.out.println(result + 1);
    }
}