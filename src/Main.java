import java.util.*;

public class Main {
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
        Main M = new Main();

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