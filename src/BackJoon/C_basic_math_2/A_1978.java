package BackJoon.C_basic_math_2;

import java.util.Scanner;

// 1. 소수찾기
public class A_1978 {
    public static void main(String[] args) {
        A_1978 M = new A_1978();

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] nums = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(M.solution(nums));
    }

    private int solution(int[] nums) {
        int count = 0;
        boolean isPrime = false;
        for (int num : nums) {
            if (primeChecker(num)) count++;
        }
        return count;
    }

    private boolean primeChecker(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
