import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int[] numArray;
	public static int rear = 0;
	public static int front = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		numArray = new int[num];

		for (int i = 0; i < num; i++) {
			String[] str = br.readLine().split(" ");

			switch (str[0]) {
				case "push":
					numArray[rear++] = Integer.parseInt(str[1]);
					break;
				case "pop":
					if (rear - front == 0)
						bw.write("-1\n");
					else
						bw.write(numArray[front++] + "\n");
					break;
				case "size":
					bw.write((rear - front) + "\n");
					break;
				case "empty":
					bw.write((rear - front == 0 ? 1 : 0) + "\n");
					break;
				case "front":
					bw.write((rear - front == 0 ? -1 : numArray[front]) + "\n");
					break;
				case "back":
					bw.write((rear - front == 0 ? -1 : numArray[rear - 1]) + "\n");
					break;
			}
		}
		bw.flush();
		bw.close();
	}
}
