// BFS : 너비우선탐색.
// BFS 알고리즘은 주로 그래프에서 모든 간선의 비용이 동일한 조건에서 최단 거리를 구하는 문제를 효과적으로 해결할 수 있는 알고리즘

import java.io.IOException;
import java.util.*;

class Pair {

    int X, Y;

    Pair(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
}

public class Fire_4179 {
    static int n, m;
    static char[][] board;
    static int[][] dist1; // 불의 전파 시간
    static int[][] dist2; // 지훈이의 이동 시간
    static int[] dx, dy;
    static Queue<Pair> Q1;
    static Queue<Pair> Q2;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new char[n][m];
        dist1 = new int[n][m]; // 불의 전파 시간
        dist2 = new int[n][m]; // 지훈이의 이동 시간
        Q1 = new LinkedList<>();
        Q2 = new LinkedList<>();
        dx = new int[] { 1, 0, -1, 0 };
        dy = new int[] { 0, 1, 0, -1 };

        // 배열 초기화
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
                dist1[i][j] = -1;
                dist2[i][j] = -1;
                if (board[i][j] == 'F') {
                    Q1.offer(new Pair(i, j));
                    dist1[i][j] = 0;
                }
                if (board[i][j] == 'J') {
                    Q2.offer(new Pair(i, j));
                    dist2[i][j] = 0;
                }
            }
        }

        //불이 존재하지 않을 때 불의 닿을 수 있는 거리가 지훈이보다 무조건 크다고 가정.
        //불이 없을 때 불의 거리가 초기화되지 않고 -1로 되어있기 때문에 impossible이 될 수 있음.
        if(Q1.isEmpty()){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    dist1[i][j] = 1000000000;
                }
            }
        }
        // 불에 대한 BFS
        while (!Q1.isEmpty()) {
            Pair cur = Q1.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.X + dx[dir];
                int ny = cur.Y + dy[dir];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (dist1[nx][ny] >= 0 || board[nx][ny] == '#') continue;
                dist1[nx][ny] = dist1[cur.X][cur.Y] + 1;
                Q1.offer(new Pair(nx, ny));
            }
        }
        // 지훈이에 대한 BFS
        while (!Q2.isEmpty()) {
            Pair cur = Q2.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.X + dx[dir];
                int ny = cur.Y + dy[dir];
                // 범위를 벗어났다는 것은 탈출에 성공했다는 의미
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    System.out.println(dist2[cur.X][cur.Y] + 1);
                    return;
                }
                if (dist2[nx][ny] >= 0 || board[nx][ny] == '#') continue;
                // 불의 전파 시간을 조건에 추가
                if (dist1[nx][ny] <= dist2[cur.X][cur.Y] + 1) continue;
                dist2[nx][ny] = dist2[cur.X][cur.Y] + 1;
                Q2.offer(new Pair(nx, ny));
            }
        }


        System.out.println("IMPOSSIBLE");
    }
}
