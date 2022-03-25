package Baekjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Java_2309 {
    public static void main(String[] args) {
        int cnt = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        while (cnt < 9) {
            list.add(scan.nextInt());
            cnt++;
        }
        list.sort(c);

    }


}
