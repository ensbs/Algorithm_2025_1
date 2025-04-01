import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		String b = scanner.next();
		
		int sum = Integer.parseInt(a) + Integer.parseInt(b);
		
		System.out.println(sum);
		
		scanner.close();
	}
}