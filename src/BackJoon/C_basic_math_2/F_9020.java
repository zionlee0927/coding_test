package BackJoon.C_basic_math_2;

import java.util.*;

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
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();

        int half = n / 2;

        if (isPrime(half)) return half+" "+half;

        for (int i = half-1; i >= 2; i--) {
            if (isPrime(i)) list1.add(i);
        }

        for (int i = n-1; i > half; i--) {
            if (isPrime(i)) list2.add(i);
        }

        for (int a :
                list1) {
            list2.forEach(m -> {
                if (m + a == n) {
                    map.put(m - a, a+" "+m);
                }
            });
        }

        Integer min = map.keySet().stream().min(Integer::compareTo).get();

        return map.get(min);
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i==0) return false;
        }
        return true;
    }
}
