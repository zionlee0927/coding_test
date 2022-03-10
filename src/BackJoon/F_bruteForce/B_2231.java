package BackJoon.F_bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2. 분해합
public class B_2231 {
    public static void main(String[] args) {
        B_2231 M = new B_2231();

        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(M.solution(n));
    }

    private int solution(String n) {
        char[] chars = n.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (char c:
             chars) {
            list.add(Integer.valueOf(String.valueOf(c)));
        }
        return 0;
    }
}
