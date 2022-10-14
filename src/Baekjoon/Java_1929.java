package Baekjoon;

import java.util.Scanner;

public class Java_1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 에라토스테네스의 체 이용
        int[] numbers = new int[M + 1];

        // 0과 1은 소수가 아니므로 제외;
        numbers[0] = numbers[1] = 0;

        for (int i = 2; i <= M; i++) {
            numbers[i] = i;
        }

        /*
            에라토스테네스의 체는 어떠한 값을 받고 계산하는게 아님.
            미리 소수들을 계산해놓고(배수제거) 그 중에 필요한 값만 출력하는 것.
            혼동하지 않도록 주의!!
         */
        for (int j = 2; j <= Math.sqrt(M); j++) { // M의 제곱근까지만 확인해도 전체 범위의 소수 판별 가능
            if (numbers[j] == 0) {
                continue;
            } else {
                // 배수 제거
                for (int k = j*2 ; k <= M; k+=j) {
                    numbers[k] = 0;
                }
            }
        }
        for (int i = N; i <= M ; i++ ) {
            if (numbers[i] != 0) {
                System.out.println(i);
            }
        }
    }
}
