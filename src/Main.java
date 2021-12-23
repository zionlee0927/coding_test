import java.util.Scanner;

public class Main {
    public void solution(int testCase, String line) {
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
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int testCase = scanner.nextInt();
            String line = scanner.nextLine().trim();
            if(!line.isBlank())
                M.solution(testCase, line);
        }
    }
}
