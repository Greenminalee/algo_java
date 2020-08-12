package algo;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/12756
 */
public class Algo41 {

	public static void main(String[] args) {
		solution();
	}

	static void solution() {
		Scanner scan = new Scanner(System.in);
		int p1a = scan.nextInt(), p1h = scan.nextInt();
		int p2a = scan.nextInt(), p2h = scan.nextInt();
		int cnt1 = 0, cnt2 = 0;
		
		while (p1h > 0) {
			p1h -= p2a;
			cnt1++;
		}
		while (p2h > 0) {
			p2h -= p1a;
			cnt2++;
		}
		
		if (cnt1 == cnt2)
			System.out.println("DRAW");
		else if (cnt1 > cnt2)
			System.out.println("PLAYER A");
		else if (cnt1 < cnt2)
			System.out.println("PLAYER B");		
	}
}
