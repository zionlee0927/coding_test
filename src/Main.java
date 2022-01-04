import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(M.solution(h, w, n));
        }
    }

    private int solution(int h, int w, int n) {
        int roomNum = 0;

        int num = n % h == 0 ? (n / h) : (n / h)+ 1;
        int floor = n % h == 0 ? h : n % h;
        roomNum += num;
        roomNum += floor*100;
        return roomNum;
    }
}