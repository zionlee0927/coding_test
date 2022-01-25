import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.println(M.solution(x,y,w,h));
    }

    private int solution(int x, int y, int w, int h) {
        return Math.min(w - x, h - y);
    }
}