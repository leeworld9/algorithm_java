package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 1; i <= cnt; i++) {
            str = br.readLine();
            if (vps_chk(str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean vps_chk(String str) {
        StringBuffer sbf = new StringBuffer();
        sbf.append(str);
        for (int i = 0; i < sbf.length() - 1; i++) {
            if (sbf.length() > 1) {
                if (sbf.charAt(i) == '(' && sbf.charAt(i + 1) == ')') {
                    sbf.deleteCharAt(i);
                    sbf.deleteCharAt(i); // 위에서 i번 인덱스를 지웠으니, i+1번 인덱스가 i로 당겨짐.
                    i = -1; // 다음 반복문 시작시에 i++로 인해 0이 됨
                }
            }
        }
        if (sbf.length() == 0)
            return true;
        else
            return false;
    }
}
