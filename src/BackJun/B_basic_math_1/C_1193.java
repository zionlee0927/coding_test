package BackJun.B_basic_math_1;

import java.util.Scanner;

// 3. 분수
public class C_1193 {
    public static void main(String[] args) {
        C_1193 M = new C_1193();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(M.solution(x));
    }

    private String solution(int x) {
        String answer = "";
        int cnt = 0;
        int row = 0;

        while (true){
            row++;
            cnt += row;
            if (cnt >= x) {
                if (row % 2 == 1) {
                    answer = (cnt-x+1)+"/"+(x-cnt+row);
                }else {
                    answer = (x-cnt+row)+"/"+(cnt-x+1);
                }
                break;
            }
        }
        return answer;
    }
}
