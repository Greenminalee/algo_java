package algo;

/*
 * https://www.acmicpc.net/problem/8958
 */
import java.util.Scanner;

public class Algo04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ox = scan.nextLine();
		System.out.println(solution(ox));
		
	}
	
	static int solution(String ox)
	{
		int tmp = 0;
		int sum = 0;
		for (int i = 0; i < ox.length(); i++)
		{
			if (ox.charAt(i) == 'O')
				tmp++;
			else
			{
				tmp = 0;
			}
			sum += tmp;
		}
		return (sum);
	}

}
