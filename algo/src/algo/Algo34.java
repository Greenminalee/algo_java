package algo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1871
 */
public class Algo34 {

	public static void main(String[] args) {
		solution();
	}

	static void solution() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String num = "";
		int sum = 0;
		String[] array = new String[n];
		for (int i = 0; i < n; i++) 
			array[i] = scan.next();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) >= 'A' && array[i].charAt(j) <= 'Z')
					sum += (int) ((array[i].charAt(j) - 'A') * Math.pow(26, 2 - j));
				else if (array[i].charAt(j) == '-')
					continue;
				else if (array[i].charAt(j) >= '0' && array[i].charAt(j) <= '9')
					num += array[i].charAt(j);
			}
			if (Math.abs(sum - Integer.parseInt(num)) <= 100)
				System.out.println("nice");
			else
				System.out.println("not nice");
			sum = 0;
			num = "";
		}

	}

}
