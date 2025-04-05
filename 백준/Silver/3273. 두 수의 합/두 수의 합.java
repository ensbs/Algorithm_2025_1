import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int[] numArray = new int[num];
		for (int i = 0 ; i < num ; i++)
			numArray[i] = scanner.nextInt();
		int x = scanner.nextInt();
        Arrays.sort(numArray);
        
        int left = 0;
        int right = num - 1;
        int result = 0;
        
        while (left < right) {
            int sum = numArray[left] + numArray[right];
            
            if (sum == x) {
                result++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
		System.out.println(result);
		scanner.close();
	}
}