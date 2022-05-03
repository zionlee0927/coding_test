package BackJoon.F_bruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 4. 체스판 다시 칠하기
public class D_1018 {
    public static void main(String[] args) {
        D_1018 M = new D_1018();
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
