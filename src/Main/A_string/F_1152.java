package Main.A_string;

import java.util.Scanner;
import java.util.StringTokenizer;

// 5. 단어의 개수
public class F_1152 {
    public void solution(String line) {
        System.out.println(new StringTokenizer(line," ").countTokens());
    }

    public static void main(String[] args) {
        F_1152 M = new F_1152();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        M.solution(s);
    }
}
