import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int[] dp = new int[num + 1];
		for (int i = 1; i <= num; i++) {
		    dp[i] = i;
		    for (int j = 1; j * j <= i; j++) {
		        dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
		    }
		}
		System.out.println(dp[num]);
	}
}