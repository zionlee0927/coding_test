package Main.B_basic_math_1;

import java.util.Scanner;

// 9. Fly me to the Alpha Centauri
public class I_1011 {
    public static void main(String[] args) throws Exception{
        I_1011 M = new I_1011();

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(M.solution(x,y));
        }

    }

    private int solution(int x, int y) {
        int count = 1;
        double distance = y - x;
        double halfOfDistance = Math.round(distance / 2);

        if (halfOfDistance == 0) return 1;
        else if (halfOfDistance == 1) return 2;
        for (int i = 1; i <= halfOfDistance; i++) {
            int sum = (i * i + i) / 2;
            if (distance < sum) break;
            count++;
        }

        return 2*count;
    }
}
