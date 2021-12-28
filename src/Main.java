import java.util.*;

public class Main {
    public void solution(String line) {
        char[] chars = line.toCharArray();

        int length = chars.length;

        for (int i = 0; i < chars.length-1; i++) {
            String s1 = String.valueOf(chars[i]);
            String s2 = String.valueOf(chars[i+1]);
            String s3 = i < chars.length-2 ? String.valueOf(chars[i+2]) : "";
            switch (s1){
                case "c":
                    if (s2.equals("=") || s2.equals("-")) {
                        length -= 1;
                        i++;
                    }
                    break;
                case "d":
                    if (s2.equals("-")) {
                        length -= 1;
                        i++;
                    } else if (s2.equals("z") && s3.equals("=")) {
                        length -= 2;
                        i+=2;
                    }
                    break;
                case "l":
                case "n":
                    if (s2.equals("j")) {
                        length -= 1;
                        i++;
                    }
                    break;
                case "s":
                case "z":
                    if (s2.equals("=")) {
                        length -= 1;
                        i++;
                    }
                    break;
            }
        }
        System.out.println(length);
    }

    public static void main(String[] args) {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        M.solution(s);
    }
}