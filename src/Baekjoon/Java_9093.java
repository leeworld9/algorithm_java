package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        String testcase;
        String[] word;
        for (int i = 1; i <= cnt; i++) {
            testcase = br.readLine();
            if (testcase.length() <= 1000) {
                word = testcase.split(" ");
                for (int j = 0; j < word.length; j++) {
                    if (word[j].length() <= 20) {
                        word_reverse(word[j]);
                        if (j == word.length - 1)
                            System.out.println();
                        else
                            System.out.print(" ");
                    } else
                        return;
                }
            } else
                return;
        }
    }

    public static void word_reverse(String word) {
        int len = word.length();
        StringBuffer sb = new StringBuffer();

        for (int i = len; i > 0; i--) {
            sb.append(word.charAt(i - 1));
        }
        word = sb.toString();
        System.out.print(word);
    }
}
