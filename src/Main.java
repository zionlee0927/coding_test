import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main M = new Main();

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