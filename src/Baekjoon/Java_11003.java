package Baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java_11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Node> nodeDeque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Node curNode = new Node(i, Long.parseLong(st.nextToken()));

            // 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
            while (!nodeDeque.isEmpty() && (curNode.value < nodeDeque.getLast().value)) {
                nodeDeque.removeLast();
            }
            nodeDeque.addLast(curNode);

            // 윈도우(L) 크기를 벗어난 값 제거
            if (nodeDeque.getFirst().idx < i - L + 1) {
                nodeDeque.removeFirst();
            }

            // 출력
            if (!nodeDeque.isEmpty()) {
                bw.write(String.valueOf(nodeDeque.getFirst().value) + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }

    static class Node {
        public int idx;
        public long value;

        Node(int idx, long value) {
            this.idx = idx;
            this.value = value;
        }
    }
}
