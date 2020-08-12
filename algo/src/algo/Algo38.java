package algo;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1793
 */

public class Algo38 {

	public static void main(String[] args) {
		solution();
	}

	static void solution() 
	{
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		String num2 = scan.next();
		int sum = 0;
		for(int i = 0; i < num1.length(); i++) {
			for(int j = 0; j < num2.length(); j++) {
				sum += (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
			}
		}
		System.out.println(sum);
	}
}
