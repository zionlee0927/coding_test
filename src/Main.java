import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main M = new Main();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(M.solution(a,b,c));
    }

    private int solution(int a, int b, int c) {
        if (b >= c) return -1;
        int dif = c - b;
        return Math.floorDiv(a, dif) + 1;
    }
}