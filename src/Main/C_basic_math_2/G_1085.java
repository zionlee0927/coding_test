package Main.C_basic_math_2;

import java.util.*;

// 7. 직사각형에서 탈출
public class G_1085 {
    public static void main(String[] args) {
        G_1085 M = new G_1085();

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
