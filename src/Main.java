import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(M.solution(n));
    }

    private String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n < 2) return "";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n%i == 0) {
                stringBuilder.append(i).append("\n");
                n /= i;
            }
        }
        if (n != 1) stringBuilder.append(n);

        return stringBuilder.toString();
    }
}