package BackJun.D_recursion;

import java.util.Scanner;

// 1. 팩토리얼
public class A_10872 {
    public static void main(String[] args) {
        A_10872 M = new A_10872();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(M.solution(N));
    }

    private int solution(int n) {
        if (n <= 1) return 1;

        return n * solution(n-1);
    }
}
