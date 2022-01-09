import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(M.solution(x,y));
        }

    }

    private int solution(int x, int y) {

        int distance = y - x;
        int max = (int) Math.sqrt(distance);

        if(max == Math.sqrt(distance)) {
            return (max * 2 - 1);
        }
        else if(distance <= max * max + max) {
            return (max * 2);
        }
        else {
            return (max * 2 + 1);
        }
    }
}