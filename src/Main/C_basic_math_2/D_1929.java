package Main.C_basic_math_2;

import java.util.Scanner;

// 4. 소수 구하기
public class D_1929 {
    public static void main(String[] args) {
        D_1929 M = new D_1929();

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(M.solution(m,n));
    }

    private String solution(int m, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = m; i <= n; i++) {
            if (i%2!=0){
                if (isPrime(i)) stringBuilder.append(i).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
