package Programers.mobilityTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_switching {
    public static void main(String[] args) {
        C_switching M = new C_switching();

        int[] A = {3,2,3,2,3};
        int result = 5;
//        int[] A = {7,4,-2,4,-2,9};
//        int result = 4;
//        int[] A = {7,-5,-5,-5,-3,-3,-3,9};
//        int result = 5;
//        int[] A = {4};
//        int result = 1;

        System.out.println(result==(M.solution(A)));
    }

    private int solution(int[] A) {
        if (A.length == 1) return 1;

        int i = 0;
        int j = A.length-1;


        return 0;
    }
}
