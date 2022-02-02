import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

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