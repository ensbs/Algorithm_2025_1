import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int x = a / b;
		int y = a % b;
		
		long result = 1;
		
		for(int i = 0 ; i < b ; i++) {
			if(i < y) {
                result *= (x + 1);
            }
			else {
				result *= x;                
            }
		}
		System.out.println(result);
		scanner.close();
	}
}
