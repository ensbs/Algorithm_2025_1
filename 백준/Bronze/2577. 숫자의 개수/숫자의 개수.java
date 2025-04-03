import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 1;
		String strNum;
		int[] result = new int[10];
		
		for (int i = 0 ; i < 3 ; i++)
		{
			String inputInt = scanner.next();
			num *= Integer.parseInt(inputInt);
		}
		strNum = Integer.toString(num);
		String[] strNumSplit = new String[strNum.length()];
		strNumSplit = strNum.split("");
		for (int i = 0 ; i < strNum.length() ; i++)
		{
			int j = 0;
			while (true)
			{
				if (j == Integer.parseInt(strNumSplit[i]))
				{
					result[j] += 1;
					break;
				}
				else
				{
					j++;
				}
					
			}
		}
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println(result[i]);
		}	
	}
	
	Scanner close;
}