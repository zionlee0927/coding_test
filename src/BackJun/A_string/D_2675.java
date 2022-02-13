package BackJun.A_string;

import java.util.Scanner;

// 4. 문자열 반복
public class D_2675 {
    public void solution(int testCase, String line){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = line.toCharArray();
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < testCase; j++) {
                stringBuilder.append(chars[i]);
            }
        }
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {
        D_2675 M = new D_2675();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int testCase = scanner.nextInt();
            String line = scanner.nextLine().trim();
            if(!line.isBlank())
                M.solution(testCase, line);
        }
    }
}
