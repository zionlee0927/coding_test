package Main.B_basic_math_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

// 6. 부녀회장이 될테야
public class F_2775 {
    public static void main(String[] args) throws Exception{
        F_2775 M = new F_2775();

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(M.solution(k, n));
        }
    }

    private int solution(int k, int n) {

        int[] num = new int[n];

        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(num, num.length);
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    num[j] = j+1;
                }else {
                    num[j] = Arrays.stream(Arrays.copyOfRange(temp, 0, j+1)).sum();
                }
            }
        }
        return num[n-1];
    }
}
