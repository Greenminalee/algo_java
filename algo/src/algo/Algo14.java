package algo;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/3172
 */
public class Algo14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<String> strs = new LinkedList<String>();
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			strs.add(scan.next());
		}
		System.out.println(solution(strs, N));

	}

	static int solution(LinkedList<String> strs, int N) {
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (compare(strs.get(i), strs.get(j)) != compare(reverse(strs.get(i)), reverse(strs.get(j)))) {
					cnt++;
				}
			}
		}
		return (cnt);
	}

	static int compare(String str1, String str2) {
		int str1len = str1.length();
		int str2len = str2.length();
		int len = str1len <= str2len ? str1len : str2len;
		for (int i = 0; i < len; i++) {
			if (str1.charAt(i) > str2.charAt(i))
				return (1);
			else if (str1.charAt(i) < str2.charAt(i))
				return (-1);
		}
		if (str1len > str2len)
			return (1);
		else if (str1len < str2len)
			return (-1);
		else
			return (0);
	}

	static String reverse(String str) {
		String tmp = "";
		for (int i = str.length() - 1; i >= 0; i--)
			tmp += str.charAt(i);
		return tmp;
	}

}
