package Main.C_basic_math_2;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;

// 6. 골드바흐의 추측
public class F_9020 {
    public static void main(String[] args) {
        F_9020 M = new F_9020();

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int nextInt = scanner.nextInt();
            System.out.println(M.solution(nextInt));
        }
    }

    private String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int half = n / 2;

        if (isPrime(half)) return stringBuilder.append(half).append(" ").append(half).toString();

        for (int i = half-1; i >= 2; i--) {
            if (isPrime(i)) list1.add(i);
        }

        for (int i = n-1; i > half; i--) {
            if (isPrime(i)) list2.add(i);
        }

        for (int a :
                list1) {
            List<String> collect = list2.stream().map(m -> {
                if (m + a == n)
                    return stringBuilder.append(a).append(" ").append(m).toString();
                return null;
            }).collect(Collectors.toList());

            int min = collect.stream().mapToInt(m -> {
                String[] s = m.split(" ");
                return Integer.parseInt(s[1]) - Integer.parseInt(s[1]);
            }).min().orElse(0);
        }

        return "";
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {

        }
        return false;
    }
}
