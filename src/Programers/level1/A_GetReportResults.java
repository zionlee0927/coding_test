package Programers.level1;

import java.util.*;
import java.util.stream.Collectors;

// 1. 신고 결과 받기 https://programmers.co.kr/learn/courses/30/lessons/92334
public class A_GetReportResults {
    public static void main(String[] args) {
        A_GetReportResults M = new A_GetReportResults();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] result = {2, 1, 1, 0};

        System.out.println(Arrays.equals(result, M.solution(id_list, report, k)));
    }

    private int[] solution(String[] id_list, String[] report, int k) {
        List<Integer> answer = new ArrayList<>();

        Set<String> reportToSet = new HashSet<>(Arrays.asList(report));
        List<String> reported = reportToSet.stream().map(r -> r.split(" ")[1]).collect(Collectors.toList());
        List<String> baned_id_list = Arrays.stream(id_list).filter(it -> Collections.frequency(reported, it) >= k).collect(Collectors.toList());

        for (String s :
                id_list) {
            List<String> collect = reportToSet.stream().map(m -> {
                if (m.startsWith(s)) return m.split(" ")[1];
                return null;
            }).filter(Objects::nonNull).collect(Collectors.toList());

            long count = collect.stream().filter(baned_id_list::contains).mapToInt(String::length).count();
            answer.add((int) count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
