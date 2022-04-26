import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

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