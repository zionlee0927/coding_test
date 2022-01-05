package Main.B_basic_math_1;

import java.util.Scanner;

// 5. ACM 호텔
public class E_10250 {
    public static void main(String[] args) throws Exception{
        E_10250 M = new E_10250();

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(M.solution(h, w, n));
        }
    }

    private int solution(int h, int w, int n) {
        int roomNum = 0;

        int num = n % h == 0 ? (n / h) : (n / h)+ 1;
        int floor = n % h == 0 ? h : n % h;
        roomNum += num;
        roomNum += floor*100;
        return roomNum;
    }
}
