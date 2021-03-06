package BackJoon.F_bruteForce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// 1. 블랙잭
public class A_2798 {
    public static void main(String[] args) {
        A_2798 M = new A_2798();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        System.out.println(M.solution(m,nums));
    }

    private int solution(int m, List<Integer> nums) {
        int result = 0;

        List<Integer> reverse_sorted = nums.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        Integer min = reverse_sorted.get(reverse_sorted.size() - 1);
        Integer next_min = reverse_sorted.get(reverse_sorted.size() - 2);

        for (int i = 0; i < reverse_sorted.size() - 3; i++) {
            if (reverse_sorted.get(i) > m - min - next_min) reverse_sorted.remove(i);
        }

        for (int i = 0; i < reverse_sorted.size()-2; i++) {
            for (int j = i+1; j < reverse_sorted.size()-1; j++) {
                for (int k = j+1; k < reverse_sorted.size(); k++) {
                    int sum = reverse_sorted.get(i) + reverse_sorted.get(j) + reverse_sorted.get(k);
                    if (sum==m) return sum;
                    if (sum <= m && m-sum < m-result) result = sum;
                }
            }
        }


        return result;
    }
}
