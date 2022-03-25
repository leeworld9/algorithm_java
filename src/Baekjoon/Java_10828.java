package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Java_10828 {

    public static void main(String[] args) throws IOException {
        //Scanner로 입력받으면 시간 초과 뜸
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> stack = new ArrayList<>();
        int cnt = Integer.parseInt(br.readLine());

        if (1 <= cnt && cnt <= 10000) {
            for (int i = 1; i <= cnt; i++) {
                // split로도 통과하였으나, 시간단축을 하고 싶은 경우에는 StringTokenizer를 사용하는 방법도 있다.
                String[] cmd = br.readLine().split(" ");
                if (!cmdChk(cmd, stack))
                    return;
            }
        } else
            return;
    }

    public static boolean cmdChk(String[] cmd, List<Integer> stack) {
        int result;

        if (cmd.length <= 2) {
            if (cmd[0].equals("push") && cmd.length == 2) {
                int num = Integer.parseInt(cmd[1]);
                if (1 <= num && num <= 100000)
                    stack.add(Integer.parseInt(cmd[1]));
                else
                    return false;
            } else if (cmd[0].equals("pop") && cmd.length == 1) {
                if (stack.size() == 0)
                    result = -1;
                else
                    result = stack.remove(stack.size() - 1);
                System.out.println(result);
            } else if (cmd[0].equals("empty") && cmd.length == 1) {
                if (stack.size() == 0)
                    result = 1;
                else
                    result = 0;
                System.out.println(result);
            } else if (cmd[0].equals("size") && cmd.length == 1) {
                result = stack.size();
                System.out.println(result);
            } else if (cmd[0].equals("top") && cmd.length == 1) {
                if (stack.size() == 0)
                    result = -1;
                else
                    result = stack.get(stack.size() - 1);
                System.out.println(result);
            } else
                return false;
        } else
            return false;
        return true;
    }
}
