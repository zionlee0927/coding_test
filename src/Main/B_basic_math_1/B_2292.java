package Main.B_basic_math_1;

import java.util.Scanner;

// 2. 벌집
public class B_2292 {
    public static void main(String[] args) {
        B_2292 M = new B_2292();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(M.solution(n));
    }

    private int solution(int n) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            if (n == 1) return 1;
            else if (i == (6 * (a + b)) + 2) {
                a = a+b;
                b++;
            }
        }
        return b+1;
    }
}
