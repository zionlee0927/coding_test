package Main.A_string;

import java.util.Scanner;
import java.util.StringTokenizer;

// 5. 단어의 개수
public class E_1152 {
    public void solution(String line) {
        System.out.println(new StringTokenizer(line," ").countTokens());
    }

    public static void main(String[] args) {
        E_1152 M = new E_1152();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        M.solution(s);
    }
}
