package Baekjoon;

import java.util.Scanner;

public class Java_1541 {

    static int result = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] str = input.split("-");
        for (int i=0; i < str.length; i++) {
            // 첫번째 값만 더해줌
            if (i == 0) {
                result += sum(str[i]);
            } else {
                result -= sum(str[i]);
            }
        }
        System.out.println(result);
    }

    static int sum(String s) {
        int sum = 0;
        String[] nums = s.split("[+]");

        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}