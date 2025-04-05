import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String firstStr = br.readLine();
		int M = Integer.parseInt(br.readLine());

		Stack<Character> leftStack = new Stack<>();
		Stack<Character> rightStack = new Stack<>();

		for (char c : firstStr.toCharArray()) {
			leftStack.push(c);
		}

		for (int i = 0; i < M; i++) {
			String command = br.readLine();

			switch (command.charAt(0)) {
			case 'L':
				if (!leftStack.isEmpty()) {
					rightStack.push(leftStack.pop());
				}
				break;
			case 'D':
				if (!rightStack.isEmpty()) {
					leftStack.push(rightStack.pop());
				}
				break;
			case 'B':
				if (!leftStack.isEmpty()) {
					leftStack.pop();
				}
				break;
			case 'P':
				char toInsert = command.charAt(2);
				leftStack.push(toInsert);
				break;
			}
		}
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		while (!leftStack.isEmpty()) {
			rightStack.push(leftStack.pop());
		}

		while (!rightStack.isEmpty()) {
			writer.write(rightStack.pop());
		}
		writer.flush();
		writer.close();

	}
}
