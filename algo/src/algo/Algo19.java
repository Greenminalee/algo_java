package algo;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2884 
 */
public class Algo19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int N = scan.nextInt();
		solution(H, N);
	}

	static int solution(int H, int N)
	{
		if(N - 45 < 0) 
		{
			N = 60 + (N - 45);
			H -= 1;
		}
		else 
			N -= 45;
		if (H < 0) 
			H += 24;
		System.out.println(H + " " + N);
		return (0);
	}
}
