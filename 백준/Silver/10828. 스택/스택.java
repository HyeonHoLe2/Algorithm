import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            if (str.startsWith("push")) {
                int num = Integer.parseInt(str.split(" ")[1]);
                dq.addLast(num);
            }
            else if (str.equals("top")) {
                if (dq.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(dq.peekLast());
                }
            }
            else if (str.equals("size")) {
                System.out.println(dq.size());
            }
            else if (str.equals("pop")) {
                if (dq.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(dq.pollLast());
                }
            }
            else if (str.equals("empty")) {
                if (dq.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}