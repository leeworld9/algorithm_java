package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] Ns = new int[N];
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            Ns[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Ns);

        for (int n : Ns)
            System.out.println(n);
    }
}
