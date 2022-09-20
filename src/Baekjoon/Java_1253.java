package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] nums = new long[size];
        for (int i = 0; i < size ; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < size ; i++) {
            int a = 0;
            int b = size - 1;
            while (a < b) {
                if (nums[a] + nums[b] == nums[i]) {
                    if (a != i && b != i) {
                        count++;
                        break;
                    } else if (a == i) {
                        a++;
                    } else if (b == i) {
                        b--;
                    }
                } else if  (nums[a] + nums[b] < nums[i]) {
                    a++;
                } else {
                    b--;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}
