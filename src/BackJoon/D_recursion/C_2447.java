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
        int k = 0;
        int temp = n;

        while (temp > 1){
            temp = temp / 3;
            k++;
        }

        return String.valueOf(k);
    }
}
