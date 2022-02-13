package BackJun.A_string;

import java.util.*;

// 4. 단어공부
public class E_1157 {
    public void solution(String line) {
        StringBuilder stringBuilder = new StringBuilder();
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
        E_1157 M = new E_1157();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        M.solution(s);
    }
}
