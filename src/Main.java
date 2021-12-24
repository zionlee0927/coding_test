import java.util.*;

public class Main {
    public void solution(String line) {
        char[] chars = line.toUpperCase().toCharArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.merge((int) chars[i], 1, Integer::sum);
        }

        Integer max = map.values().stream().max(Comparator.comparingInt(Integer::intValue)).get();
        int cnt = 0;
        char answer = 0;
        for (Integer key :
                map.keySet()) {
            if (map.get(key)==max) {
                ++cnt;
                answer = (char) key.intValue();
            }
        }
        System.out.println(cnt == 1 ? answer : "?");
    }

    public static void main(String[] args) {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        M.solution(s);
    }
}