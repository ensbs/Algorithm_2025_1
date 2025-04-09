import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int[] numArray;
	public static int top = 0;
	public static int bottom = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		numArray = new int[num];

		for (int i = 0; i < num; i++) {
			String[] str = br.readLine().split(" ");

			switch (str[0]) {
				case "push":
					numArray[top++] = Integer.parseInt(str[1]);
					break;
				case "pop":
					if (top - bottom == 0)
						bw.write("-1\n");
					else
						bw.write(numArray[bottom++] + "\n");
					break;
				case "size":
					bw.write((top - bottom) + "\n");
					break;
				case "empty":
					bw.write((top - bottom == 0 ? 1 : 0) + "\n");
					break;
				case "front":
					bw.write((top - bottom == 0 ? -1 : numArray[bottom]) + "\n");
					break;
				case "back":
					bw.write((top - bottom == 0 ? -1 : numArray[top - 1]) + "\n");
					break;
			}
		}
		bw.flush();
		bw.close();
	}
}
