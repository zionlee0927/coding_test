package BackJun.A_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 9. 그룹단어
public class J_1316 {
    public boolean solution(String line) {
        char[] chars = line.toCharArray();
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(chars[0]));
        for (int i = 0; i < chars.length-1; i++) {
            String s = String.valueOf(chars[i]);
            String next = String.valueOf(chars[i+1]);
            if (!s.equals(next)){
                if(list.contains(next)) return false;
                list.add(next);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        J_1316 M = new J_1316();

        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < testCase; i++) {
            String s = scanner.nextLine();
            if(M.solution(s)) count++;

        }
        System.out.println(count);
    }
}
