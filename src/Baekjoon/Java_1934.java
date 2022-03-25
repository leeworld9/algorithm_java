package Baekjoon;

import java.util.Scanner;

public class Java_1934 {
    public static int gcd(int a, int b) // 유클리드 호제법 이용 (시간복잡도 줄이기 위해 사용)
    {                                    // https://myjamong.tistory.com/138
        if (b == 0)
            return (a);
        else
            return (gcd(b, a % b));
    }

    public static int lcm(int a, int b) // 최소공배수 = 두수의 곱 / 최대공약수
    {
        return ((a * b) / gcd(a, b));
    }

    public static void swap(int[] arr, int num1, int num2) {
        int tmp;

        tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;
    }

    public static void main(String[] args) {
        int line;
        String[] str;
        int[] arr = new int[2];

        Scanner scan = new Scanner(System.in);

        line = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < line; i++) {
            str = (scan.nextLine()).split(" ");
            arr[0] = Integer.parseInt(str[0]);
            arr[1] = Integer.parseInt(str[1]);
            if (arr[0] < arr[1])
                swap(arr, 0, 1);
            System.out.println(lcm(arr[0], arr[1]));
        }
        scan.close();
    }
}
