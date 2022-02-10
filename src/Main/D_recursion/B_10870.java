package Main.D_recursion;

import java.util.Scanner;

// 2. 피보나치 수열 5
public class B_10870 {
    public static void main(String[] args) {
        B_10870 M = new B_10870();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(M.solution(N));
    }

    private int solution(int n) {
        if (n < 1) return 0;

        return solution(n-1) + solution(n-2);
    }
}
