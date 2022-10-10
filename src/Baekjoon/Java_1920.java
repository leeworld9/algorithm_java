package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Java_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //주어진 갯수
        int n = sc.nextInt();
        //주어진 수들
        int[] ns = new int[n];
        for (int i = 0; i < n ; i++) {
            ns[i] = sc.nextInt();
        }

        // 찾을 수 갯수
        int m = sc.nextInt();
        // 찾을 수들
        int[] ms = new int[m];
        for (int j = 0; j < m ; j++) {
            ms[j] = sc.nextInt();
        }

        // 주어진 수 정렬
        Arrays.sort(ns);

        for (int k = 0; k < m ; k++) {
            int target = ms[k];
            int start = 0;
            int end = ns.length - 1;
            boolean res = false;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (target > ns[mid]) {
                    start = mid + 1; // ns[mid]가 target 과 같지는 않으므로 +1 인덱스 저장 ( 밑에서 같은지 체크함 )
                } else if (target < ns[mid]) {
                    end = mid - 1 ; // ns[mid]가 target 과 같지는 않으므로 -1 인덱스 저장 ( 밑에서 같은지 체크함 )
                } else {
                    // 찾음
                    res = true;
                    break;
                }
            }

            if (res) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
