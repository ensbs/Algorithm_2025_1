import java.util.Scanner;

public class Main {
    public static int[][] node;
    public static boolean[] visit;
    public static int M,N;
    public static int result = 0;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();

        node = new int[M+1][M+1];
        visit = new boolean[M+1];

        for(int i=0; i<N; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            node[m][n] = node[n][m] = 1;
        }
        
        dfs(1);
        System.out.println(result-1);
    }
    
    public static void dfs(int x){
        visit[x] = true;
        result += 1;

        for(int i = 1; i<= M; i++){
            if(node[x][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
    }
}
