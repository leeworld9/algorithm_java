package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 입력 1
        int[] input = new int[2];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 2 ; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        // 입력 2
        int[] nums = new int[input[0]];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < input[0]; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 입력 3
        int[][] lines = new int[input[1]][2];
        int j;

        for (int i = 0 ; i < input[1]; i++) {
            st = new StringTokenizer(br.readLine());
            j = 0;
            int[] range = new int[2];
            for (; j < 2; j++) {
                range[j] = Integer.parseInt(st.nextToken());
            }
            lines[i] = range;
        }
        br.close();

        // 구간합
        int[] sumArray = new int[input[0]];
        int sum = 0;
        for (int i = 0 ; i < input[0]; i++) {
            sum += nums[i];
            sumArray[i] = sum;
        }

        // 출력 1
        for (int i = 0 ; i < input[1]; i++) {
            int startIdx = lines[i][0] - 1;
            int endIdx = lines[i][1] - 1;
            if (startIdx == 0)
                bw.write(sumArray[endIdx] + "\n");
            else
                bw.write(sumArray[endIdx] - sumArray[startIdx - 1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
