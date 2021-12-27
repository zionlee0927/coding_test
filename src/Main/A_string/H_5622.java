package Main.A_string;

import java.util.Scanner;

// 7. 다이얼
public class H_5622 {
    public void solution(String s) {
        int sum = s.chars().map(c -> {
            int a = 2;
            if (c > 64 && c < 68) a=3;
            else if (c < 71) a=4;
            else if (c < 74) a=5;
            else if (c < 77) a=6;
            else if (c < 80) a=7;
            else if (c < 84) a=8;
            else if (c < 87) a=9;
            else if (c < 91) a=10;
            return a;
        }).sum();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        H_5622 M = new H_5622();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        M.solution(s);
    }
}
