import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i = 1 ; i < num + 1 ; i++)
		{
			deque.addFirst(i);
		}
		while(deque.size() > 1)
		{
			deque.removeLast();
			deque.addFirst(deque.removeLast());
		}
		System.out.println(deque.getFirst());
        scanner.close();
	}
}
