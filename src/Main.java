import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(M.solution(n));
    }

    private int solution(int n) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            if (n == 1) return 1;
            else if (i == (6 * (a + b)) + 2) {
                a = a+b;
                b++;
            }
        }
        return b+1;
    }
}