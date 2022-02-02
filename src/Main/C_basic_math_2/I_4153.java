package Main.C_basic_math_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 8. 네 번째 점
public class I_4153 {
    public static void main(String[] args) {
        I_4153 M = new I_4153();

        Scanner scanner = new Scanner(System.in);

        while (true){
            int a = scanner.nextInt();
            if (a == 0) break;
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(M.solution(a,b,c));
        }
    }

    private String solution(int a, int b, int c) {

        List<Integer> collect = Stream.of(a, b, c)
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());

        int ausar = collect.get(0);
        int auset = collect.get(1);
        int heru = collect.get(2);

        if (Math.pow(ausar,2)+Math.pow(auset,2) == Math.pow(heru,2)) return "right";

        return "wrong";
    }
}
