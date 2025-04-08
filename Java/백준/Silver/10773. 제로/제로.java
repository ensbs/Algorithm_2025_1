import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0 ; i < num ; i++)
		{
			int inputNum = Integer.parseInt(scanner.nextLine());
			if(inputNum == 0)
				stack.pop();
            else
                stack.push(inputNum);
		}
		
		int result = 0;

		while(!stack.isEmpty())
			result+=stack.pop();

		System.out.println(result);
	}
}