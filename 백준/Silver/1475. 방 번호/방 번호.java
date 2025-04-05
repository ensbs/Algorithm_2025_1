import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numArray = new int[10];
		String str = br.readLine();
		
		for (char c : str.toCharArray())
		{
			int num = c - '0';
			if (num == 9)
				num = 6;
			numArray[num]++;
		}
		
		numArray[6] = (numArray[6] / 2) + (numArray[6] % 2);
		
		Arrays.sort(numArray);
		
		System.out.println(numArray[9]);
	}

}
