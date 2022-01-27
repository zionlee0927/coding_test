import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        System.out.print(M.solution(x1,y1,x2,y2,x3,y3));
    }

    private String solution(int x1, int y1, int x2, int y2, int x3, int y3) {
        int x4 = (x1 == x2) ? x3 : (x1 == x3 ? x2 : x1);
        int y4 = (y1 == y2) ? y3 : (y1 == y3 ? y2 : y1);

        return x4 + " " + y4;
    }
}