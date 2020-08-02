package algo;

/*
 * https://www.acmicpc.net/problem/1152
 */
import java.util.Scanner;

public class Algo07 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println(solution(str));
	}
	
	static int solution(String str)
	{
		int cnt = 1;
		
		for(int i = 0; i < str.length(); i++)
		{
			if (i < str.length() - 1 && str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
				continue;
			if (str.charAt(i) == ' ')
				cnt++;
		}
		if (str.charAt(0) == ' ')
			cnt--;
		if(str.charAt(str.length() - 1) == ' ')
			cnt--;
		return (cnt);
	}

}
