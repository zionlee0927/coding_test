import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main M = new Main();

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