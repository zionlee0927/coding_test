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
        int count = 1;
        double distance = y - x;
        double halfOfDistance = Math.round(distance / 2);

        if (distance == 1) return 1;
        else if (distance == 2) return 2;

        return count+ (int) halfOfDistance;
    }
}