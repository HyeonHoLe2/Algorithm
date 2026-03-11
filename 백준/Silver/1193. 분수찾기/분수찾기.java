import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int line = 1;
        int sum = 0;

        while(sum + line < x){
            sum += line;
            line++;
        }

        int pos = x - sum;

        int i, j;

        if(line % 2 == 0){
            i = pos;
            j = line - pos + 1;
        } else {
            i = line - pos + 1;
            j = pos;
        }

        System.out.println(i + "/" + j);
    }
}