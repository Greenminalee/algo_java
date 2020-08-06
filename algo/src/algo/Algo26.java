package algo;

import java.util.Scanner;

/*
 * 명령 프롬포트
 * https://www.acmicpc.net/problem/1032
 */

class Algo26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String beg = "";
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = scan.next();
		}
		solution(result, n, beg);
	}

	static int solution(String result[], int n, String beg) {
		int cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < result.length; j++) {
				if (result[i].charAt(j) != result[i + 1].charAt(j)) {
					beg += result[i].charAt(j);
				}
			}
		}
		System.out.println(beg);
		return (0);
	}

}
