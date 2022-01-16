package Main.C_basic_math_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 3. 소인수분해
public class C_11653 {
    public static void main(String[] args) {
        C_11653 M = new C_11653();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(M.solution(n));
    }

    private String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n < 2) return "";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n%i == 0) {
                stringBuilder.append(i).append("\n");
                n /= i;
            }
        }
        if (n != 1) stringBuilder.append(n);

        return stringBuilder.toString();
    }
}
