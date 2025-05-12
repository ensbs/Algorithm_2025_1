import java.io.*;
import java.util.*;

public class Main {

    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};
    private static int[][] apt;
    static int count = 0;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        apt = new int[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                apt[i][j] = str.charAt(j) - '0';
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int result = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count = 0;
                if (apt[i][j] == 1) {
                    dfs(i, j);
                    arr.add(count);
                    result++;
                }
            }
        }
        
        Collections.sort(arr);
        System.out.println(result);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void dfs (int x, int y){
        apt[x][y] = 0;
        count += 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && apt[nx][ny] == 1) dfs(nx, ny);
        }
    }
}
