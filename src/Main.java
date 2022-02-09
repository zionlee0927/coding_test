import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(M.solution(N));
    }

    private int solution(int n) {
        if (n <= 1) return 1;

        return n * solution(n-1);
    }
}