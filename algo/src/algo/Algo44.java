package algo;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2902
 */
public class Algo44 {

	public static void main(String[] args) {
		solution();
	}

	static void solution()
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == '-')
			System.out.print(str.charAt(i + 1));
		}
	}
}
