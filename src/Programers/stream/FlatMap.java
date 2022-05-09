package Programers.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// 3. 덩치
/*
* 김프로, 축구:농구:야구, 구기종목 좋아요
정프로, 개발:당구:족구, 개발하는데 뛰긴 싫어
앙몬드, 피아노, 죠르디가 좋아요 좋아좋아너무좋아
죠르디, 스포츠댄스:개발, 개발하는 죠르디
* */
public class FlatMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<String>> persons = new ArrayList<>();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split(",");
            persons.add(List.of(split));
        }

        persons.remove(0);

        System.out.println("persons = " + persons);
        persons.stream().flatMap(info -> Arrays.stream(info.get(1).split(":")));
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
