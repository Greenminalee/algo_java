package algo;

import java.util.LinkedList;

/*
 * https://www.acmicpc.net/problem/2908
 */
public class Algo10 {

	public static void main(String[] args) {

		System.out.println(solution(123, 456));
	}

	static int solution(int a, int b) {
		String snum = "";
		String tmp = "";

		snum = Integer.toString(a);
		for (int i = snum.length() - 1; i >= 0; i--)
			tmp += snum.charAt(i);
		a = Integer.parseInt(tmp);

		tmp = "";
		snum = Integer.toString(b);
		for (int i = snum.length() - 1; i >= 0; i--)
			tmp += snum.charAt(i);
		b = Integer.parseInt(tmp);

		a = a > b ? a : b;
		return (a);
	}
}
