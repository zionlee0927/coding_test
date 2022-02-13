package BackJun.C_basic_math_2;

import java.util.Scanner;

// 5. 베르트랑 공준
public class E_4948 {
    public static void main(String[] args) {
        E_4948 M = new E_4948();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int testCase = scanner.nextInt();
            if (testCase == 0) break;
            System.out.println(M.solution(testCase));
        }
    }

    private int solution(int n) {
        int count = 0;
        for (int i = n+1; i <= 2*n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
