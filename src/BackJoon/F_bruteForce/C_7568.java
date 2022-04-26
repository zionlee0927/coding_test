package BackJoon.F_bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// 3. 덩치
public class C_7568 {
    public static void main(String[] args) {
        C_7568 M = new C_7568();
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int testCase = Integer.parseInt(s);
        int[][] arr = new int[testCase][2];
        for (int i = 0; i < testCase; i++) {
            String nextLine = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(nextLine);
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        M.solution(arr);
    }

    private void solution(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            int weight = arr[i][0];
            int height = arr[i][1];
            for (int j = 0; j < arr.length; j++) {
                if (weight < arr[j][0] && height < arr[j][1]) rank++;
            }
            if (i == arr.length-1) System.out.print(rank);
            else System.out.print(rank+" ");
        }
    }
}
