import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        boolean[][] arr = new boolean[w][h];

        for (int i = 0; i < w; i++) {
            String next = scanner.next();
            for (int j = 0; j < h; j++) {
                arr[i][j] = next.charAt(j) == 'W';
            }
        }

        System.out.println(M.solution(w,h,arr));
    }

    private int solution(int w, int h, boolean[][] arr) {
        int min = 64;
        for (int i = 0; i < w - 7; i++) {
            for (int j = 0; j < h - 7; j++) {
                min = Math.min(min, check(arr, i, j));
            }
        }
        return min;
    }

    private int check(boolean[][] arr, int x, int y) {
        int cnt = 0;
        boolean first = arr[x][y];
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != first) cnt++;
                first = (!first);
            }
            first = (!first);
        }
        return Math.min(cnt, 64-cnt);
    }
}