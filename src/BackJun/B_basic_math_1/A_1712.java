package BackJun.B_basic_math_1;

import java.util.Scanner;

// 1. 손익분기점
public class A_1712 {
    public static void main(String[] args) {
        A_1712 M = new A_1712();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(M.solution(a,b,c));
    }

    private int solution(int a, int b, int c) {
        if (b >= c) return -1;
        int dif = c - b;
        return Math.floorDiv(a, dif) + 1;
    }
}
