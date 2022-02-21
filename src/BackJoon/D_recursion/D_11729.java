package BackJoon.D_recursion;

import java.util.Scanner;

// 4. 하노이 탑 이동 순서
public class D_11729 {
    public static void main(String[] args) {
        D_11729 M = new D_11729();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(M.solution(N));
    }

    private int solution(int n) {
        if (n < 1) return 0;
        else if (n == 1) return  1;
        return solution(n-1) + solution(n-2);
    }
}
