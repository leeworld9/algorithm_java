package Baekjoon;

import java.util.Scanner;

public class Java_2609 {
    public static int gcd(int a, int b) //최대공약수
    {
        int gcm = 0;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcm = i;
        }
        return (gcm);
    }

    public static int lcm(int a, int b) //최소공배수
    {
        int lcm;
        int i;

        i = 1;
        while (true) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
            i++;
        }
        return (lcm);
    }

    public static void main(String[] args) {
        int a;
        int b;
        String[] str;

        Scanner scan = new Scanner(System.in);

        str = (scan.nextLine()).split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
        scan.close();
    }
}
