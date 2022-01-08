package Main.B_basic_math_1;

import java.math.BigInteger;
import java.util.Scanner;

// 8. 큰 수 A+B
public class H_10757 {
    public static void main(String[] args) throws Exception{
        H_10757 M = new H_10757();

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        System.out.println(M.solution(a,b));
    }

    private BigInteger solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        return A.add(B);
    }
}
