package Baekjoon;

import java.util.Scanner;

public class Java_1978 {
    public static void main(String[] args) {
		/*
		소수 판별 알고리즘 (시간복잡도 고려하여 1택)
		1. 일반적인 방법 => 2 ~ N-1까지 하나라도 나눠 떨어지는지 체크하는 방법
		2. '제곱근'을 이용한 방법 => 시간복잡도 : O(sqrt(n))
		3. '에라토스테네스의 체'를 이용한 방법 => 시간복잡도 : O(nloglogn)
		 */

        // '제곱근' 이용
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        scan.nextLine(); // 버퍼 제거

        String[] str = (scan.nextLine()).split(" ");
        int res = 0;
        for (int i = 0; i < cnt; i++) {
            if (chk_prime(Integer.parseInt(str[i])))
                res++;
        }
        System.out.println(res);
        scan.close();
    }

    public static boolean chk_prime(int num) {

        if (num <= 1)
            return (false);
        if (num == 2)
            return (true);
        if (num % 2 == 0) //짝수 (2는 예외)
            return (false);
        else { //홀수
            for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
                if (num % i == 0)
                    return (false);
            }
            return (true);
        }
    }
}
