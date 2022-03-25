package Baekjoon;

import java.util.Scanner;

public class Java_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (2 > num[i] || 10000 < num[i]) {
                System.out.println("2 ≤ A, B, C ≤ 10000");
                i--;
            }
        }

        System.out.println((num[0] + num[1]) % num[2]);
        System.out.println(((num[0] % num[2]) + (num[1] % num[2])) % num[2]);
        System.out.println((num[0] * num[1]) % num[2]);
        System.out.println(((num[0] % num[2]) * (num[1] % num[2])) % num[2]);
        sc.close();
    }
}
