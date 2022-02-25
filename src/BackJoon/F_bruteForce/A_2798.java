package BackJoon.F_bruteForce;

import java.util.Arrays;
import java.util.Scanner;

// 1. 블랙잭
public class A_2798 {
    public static void main(String[] args) {
        A_2798 M = new A_2798();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(M.solution(n,m,nums));
    }

    private int solution(int n, int m, int[] nums) {

        System.out.println(n);
        System.out.println(m);
        System.out.println("----------------");

        System.out.println(Arrays.toString(nums));
        return 1;
    }
}
