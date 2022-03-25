package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Java_1874 {
    static List<String> show = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        sc.nextLine(); // 버퍼제거
        int[] num = new int[n];


        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            sc.nextLine(); // 버퍼제거
            if (1 > num[i] || 100000 < num[i]) {
                System.out.println("1 ≤ n ≤ 100,000");
            } else if (num[i] > n) {
                System.out.println("1 이상 n 이하의 정수만 가능");
            }
        }
        int chk = 0; // 찾은 수열의 인덱스
        int input = 1; // 입력되는 연속된 숫자 1~n까지
        while (chk != n) {
            if (input > n) {
                System.out.println("NO");
                return;
            }
            stack.push(input++);
            show.add("+");
            chk = chk_stack(stack, num, chk);
        }
        for (String str : show)
            System.out.println(str);
    }

    public static int chk_stack(Stack<Integer> stack, int[] num, int chk) {
        while (!stack.empty()) {
            if (stack.peek() == num[chk]) {
                chk++;
                stack.pop();
                show.add("-");
            } else
                break;
        }
        return chk;
    }
}
