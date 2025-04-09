import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());
		
		int[] numArray = new int[num];
		
		for(int i = 0 ; i < num ; i++)
		{
			numArray[i] = Integer.parseInt(scanner.nextLine());
		}
		
		Stack <Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
		
		int x = 1;
		
		for (int n : numArray)
		{
			while(x <= n)
			{
				stack.push(x++);
				sb.append("+\n");

			}
			if (n == stack.peek())
			{
				stack.pop();
				sb.append("-\n");
			}
			else if(n < stack.peek())
			{
				System.out.println("NO");
				return;
			}
		}
        System.out.print(sb.toString());		
		scanner.close();
	}
}