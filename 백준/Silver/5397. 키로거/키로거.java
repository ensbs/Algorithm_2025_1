import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int caseNum = Integer.parseInt(br.readLine());
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(caseNum-- > 0) {
			Stack<Character> leftStack = new Stack<>();
			Stack<Character> rightStack = new Stack<>();
			String inputStr = br.readLine();
			
			for (char c : inputStr.toCharArray()) {
				switch (c) {
				case '<':
					if (!leftStack.isEmpty()) {
						rightStack.push(leftStack.pop());
					}
					break;
				case '>':
					if (!rightStack.isEmpty()) {
						leftStack.push(rightStack.pop());
					}
					break;
				case '-':
					if (!leftStack.isEmpty()) {
						leftStack.pop();
					}
					break;
				default:
					leftStack.push(c);
					break;
				}
			}
			while (!leftStack.isEmpty()) {
				rightStack.push(leftStack.pop());
			}
			while (!rightStack.isEmpty()) {
				writer.write(rightStack.pop());
			}
            writer.newLine();
		}
		writer.flush();
		writer.close();
	}
}