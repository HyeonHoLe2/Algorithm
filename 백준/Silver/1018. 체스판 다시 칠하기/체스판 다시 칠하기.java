import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            board[i] = sc.next().toCharArray();
        }

        int answer = Integer.MAX_VALUE;

        for (int x = 0; x <= n - 8; x++) {
            for (int y = 0; y <= m - 8; y++) {

                int wCount = 0;
                int bCount = 0; 

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {

                        char current = board[x + i][y + j];

                        if ((i + j) % 2 == 0) {
                            if (current != 'W') wCount++;
                            if (current != 'B') bCount++;
                        } else {
                            if (current != 'B') wCount++;
                            if (current != 'W') bCount++;
                        }
                    }
                }

                int min = Math.min(wCount, bCount);
                answer = Math.min(answer, min);
            }
        }

        System.out.println(answer);
    }
}