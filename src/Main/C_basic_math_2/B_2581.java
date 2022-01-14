package Main.C_basic_math_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 2. 소수
public class B_2581 {
    public static void main(String[] args) {
        B_2581 M = new B_2581();

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(M.solution(m,n));
    }

    private String solution(int m, int n) {
        List<Integer> primes = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if(isPrime(i)) primes.add(i);
        }
        if (primes.size() == 0) return "-1";

        int sum = primes.stream().mapToInt(Integer::intValue).sum();
        int max = primes.stream().min(Comparator.comparing(p->p)).get();

        stringBuilder.append(sum).append("\n").append(max);

        return String.valueOf(stringBuilder);
    }

    private boolean isPrime(int i) {
        if (i < 2) return false;

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
