package Baekjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

class Java_9613 {
    public static class Descending implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return (a);
        else
            return (gcd(b, a % b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        //버퍼 지우기
        scan.nextLine();
        for (int i = 0; i < line; i++) {
            String[] str = (scan.nextLine()).split(" ");
            int num = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < num; j++) {
                list.add(Integer.parseInt(str[j + 1]));
            }
            Collections.sort(list, new Descending());
            System.out.println(calc_gcd(list));
        }
        scan.close();
    }

    public static long calc_gcd(ArrayList list) {
        int cnt = list.size();
        long total_gcd = 0;

        for (int i = 0; i < (cnt - 1); i++) {
            for (int j = i; j < (cnt - 1); j++) {
                total_gcd += gcd(Integer.parseInt(list.get(i).toString()), Integer.parseInt(list.get(j + 1).toString()));
            }
        }
        return (total_gcd);
    }
}
