import java.util.Scanner;

public class Main {
	
	public static int[] que;
	public static int top = 0;
	public static int bottom = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		
		que = new int[num];
		
		for (int i = 0; i < num ; i++)
		{
			String[] str = scanner.nextLine().split(" ");
			
			switch (str[0]) {
			case "push": {
				que[top++] = Integer.parseInt(str[1]);
				break;
			}
			case "pop": {
				System.out.println((top == bottom) ? -1 :que[bottom++]);
				break;
			}
			case "size": {
				System.out.println(top - bottom);
				break;
			}
			case "empty": {
				System.out.println(((top - bottom) == 0) ? 1 : 0);
				break;
				
			}
			case "front": {
				System.out.println(((top - bottom) == 0) ? -1 :que[bottom]);
				break;
			}
			case "back": {
				System.out.println(((top - bottom) == 0) ? -1 :que[top-1]);
				break;
			}
			}
		}
	}
}
