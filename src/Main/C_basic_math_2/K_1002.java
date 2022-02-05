package Main.C_basic_math_2;

import java.util.Scanner;

// 10. 터렛
public class K_1002 {
    public static void main(String[] args) {
        K_1002 M = new K_1002();

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        System.out.println(M.solution(r));
    }

    private String solution(int r) {
        return Math.PI * Math.pow(r, 2) + "\n" + 2 * Math.pow(r, 2);
    }
}
