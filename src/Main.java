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
        int right = w - x;
        int left = x;
        int top = h - y;
        int bottom = y;

        return Math.min(Math.min(right, left), Math.min(top,bottom));
    }
}