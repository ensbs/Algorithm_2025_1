import java.util.Scanner;

public class Main {
	
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		
		stack = new int[num];
		
		for (int i = 0; i < num ; i++)
		{
			String[] str = scanner.nextLine().split(" ");
			
			switch (str[0]) {
			case "push": {
				stack[size++] = Integer.parseInt(str[1]);
				break;
			}
			case "pop": {
				if (size == 0)
					System.out.println(-1);
				else
					System.out.println(stack[--size]);
				break;
			}
			case "size": {
				System.out.println(size);
				break;
			}
			case "empty": {
				System.out.println((size == 0) ? 1 : 0);
				break;
				
			}
			case "top": {
				System.out.println((size == 0) ? -1 :stack[size-1]);
				break;
			}
			}
		}
	}
}