package algo;

/*
 * https://www.acmicpc.net/problem/9012
 */
import java.util.Scanner;

public class Algo05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ps = scan.nextLine();
		
		System.out.println(solution(ps));
	}
	
	static String solution(String ps)
	{
		int check = 0;
		if (ps.charAt(0) == ')' || ps.charAt(ps.length() - 1) == '(')
			return ("NO");
		for(int i = 0; i < ps.length(); i++)
			check += ps.charAt(i) == '(' ? 1 : -1 ;
		if(check == 0)
			return "YES";
		else 
			return "NO";
	}
}