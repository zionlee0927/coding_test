import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        System.out.println(M.solution(r));
    }

    private String solution(int r) {
        return Math.PI * Math.pow(r, 2) + "\n" + 2 * Math.pow(r, 2);
    }
}