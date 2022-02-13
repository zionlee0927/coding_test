package BackJun.C_basic_math_2;

import java.util.Scanner;

// 9. 택시 기하학
public class J_3053 {
    public static void main(String[] args) {
        J_3053 M = new J_3053();

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        System.out.println(M.solution(r));
    }

    private String solution(int r) {
        return Math.PI * Math.pow(r, 2) + "\n" + 2 * Math.pow(r, 2);
    }
}
