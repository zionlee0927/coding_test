package Main.B_basic_math_1;

import java.util.Arrays;
import java.util.Scanner;

// 7. 설탕 배달
public class G_2839 {
    public static void main(String[] args) throws Exception{
        G_2839 M = new G_2839();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(M.solution(n));
    }

    private int solution(int n) {

        if (n == 4 || n == 7) {
            return -1;
        }
        else if (n % 5 == 0) {
            return (n / 5);
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            return (n / 5) + 1;
        }
        else return (n / 5) + 2;
    }
}
