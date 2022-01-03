package Main.B_basic_math_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 4. 달팽이는 올라가고 싶다
public class D_2869 {
    public static void main(String[] args) throws Exception{
        D_2869 M = new D_2869();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        System.out.println(M.solution(a,b,v));
    }

    private static int solution(int a, int b, int v) {
        int day = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0)
            day++;

        return day;
    }
}
