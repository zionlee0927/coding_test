import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(M.solution(n));
    }

    private int solution(int n) {

        if (n == 4 || n == 7) {
            return -1;
        }
        else if (n % 5 == 0) {
            return (n / 5);
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            return (n / 5) + 1;
        }
        else return (n / 5) + 2;
    }
}