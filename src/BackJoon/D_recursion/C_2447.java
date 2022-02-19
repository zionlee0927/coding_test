package BackJoon.D_recursion;

import java.util.Scanner;

// 3. 별찍기 - 10
public class C_2447 {
    public static void main(String[] args) {
        C_2447 M = new C_2447();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(M.solution(N));
    }

    private String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        int temp = n;

        while (temp > 1){
            temp = temp / 3;
            k++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=1 && j!=1){
                    sb.append("*");
                }
                if (j==n-1) sb.append("\n");
            }
        }

        return sb.toString();
    }
}
