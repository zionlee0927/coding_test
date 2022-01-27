package Main.C_basic_math_2;

import java.util.Scanner;

// 8. 네 번째 점
public class H_3009 {
    public static void main(String[] args) {
        H_3009 M = new H_3009();

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        System.out.println(M.solution(x1,y1,x2,y2,x3,y3));
    }

    private String solution(int x1, int y1, int x2, int y2, int x3, int y3) {
        int x4 = (x1 == x2) ? x3 : (x1 == x3 ? x2 : x1);
        int y4 = (y1 == y2) ? y1 : (y1 == y3 ? y2 : y1);

        return x4 + " " + y4;
    }

}
