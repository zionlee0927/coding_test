import java.util.*;

public class Main {
    public void solution(String s1,String s2) {
        int s1ToInt = Integer.parseInt(new StringBuilder(s1).reverse().toString());
        int s2ToInt = Integer.parseInt(new StringBuilder(s2).reverse().toString());

        System.out.println(Math.max(s1ToInt, s2ToInt));

    }

    public static void main(String[] args) {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        M.solution(s1,s2);
    }
}