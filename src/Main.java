import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(M.solution(s));
    }

    private int solution(String s) {
        int m = 0;
        int n = Integer.parseInt(s);

        char[] chars = s.toCharArray();
        int length = chars.length;
        int min = 9 * (length - 1) + Integer.parseInt(String.valueOf(chars[0]));


        for (int i = n-min; i <= n; i++) {
            char[] charArray = String.valueOf(i).toCharArray();
            List<Integer> list = new ArrayList<>();
            for (char c :
                    charArray) {
                list.add(Integer.parseInt(String.valueOf(c)));
            }
            int sum = list.stream().mapToInt(Integer::intValue).sum();

            if (i+sum == n) return i;
        }

        return m;
    }
}