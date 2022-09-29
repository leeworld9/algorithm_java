package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java_1260 {
    static ArrayList<Integer>[] Ms;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 초기화
        Ms = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            Ms[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            Ms[u].add(v);
            Ms[v].add(u); // 양방향 에지이므로 양쪽에 에지를 더하기
        }
        br.close();

        // 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문, 따라서 정렬 필요
        for (int i = 1; i <= N; i++) {
            Collections.sort(Ms[i]);
        }

        // DFS
        DFS(V);

        System.out.println();

        // BFS
        Arrays.fill(visited, false); // 다시 사용하기 위해 false로 초기화
        BFS(V);
    }

    static void DFS(int node) {
        System.out.print(node + " ");
        if (visited[node]) {
            return ;
        }
        visited[node] = true;
        for (int i : Ms[node]) {
            if (!visited[i]) {

                DFS(i);
            }
        }
    }

    static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int i = queue.poll();
            System.out.print(i + " ");
            for (int j : Ms[i]) {
                if (!visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }

        }
    }
}
