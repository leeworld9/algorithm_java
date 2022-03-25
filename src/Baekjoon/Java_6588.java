package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_6588 {
    public static void main(String[] args) {
        int num;
        int limit = 1000000;
        boolean[] arr = new boolean[limit + 1];

        Scanner scan = new Scanner(System.in);

        chk_eratos(limit, arr);
        while (true) {
            num = scan.nextInt();
            scan.nextLine(); // 버퍼 제거
            if (num % 2 == 0 && num > 4) {
                if (num <= limit)
                    chk_goldbach(num, limit, arr);
            }
            if (num == 0)
                break;
        }
        scan.close();
    }

    public static void chk_eratos(int limit, boolean[] arr) {
        //시간 초과로 인해 `에라토스테네스의 체` 이용
        arr[0] = true;
        arr[1] = true;

        // 2부터 특정 수의 배수에 해당하는 수를 모두 지움
        for (int i = 2; i <= limit; i++) {
            if (arr[i])
                continue;// 이미 지워진 수라면 건너뜀

            // 이미 지워진 숫자가 아니라면, 해당 숫자의 배수를 모두 true로 만듦
            for (int j = i * 2; j <= limit; j += i) {
                arr[j] = true;
            }
        }

    }

    public static void chk_goldbach(int num, int limit, boolean[] arr) {
        for (int i = 2; i <= limit; i++) {
            if (!arr[i] && !arr[num - i]) {
                System.out.println(num + " = " + i + " + " + (num - i));
                return;
            }
        }
        System.out.println("Goldbach's conjecture is wrong.");
    }
}
