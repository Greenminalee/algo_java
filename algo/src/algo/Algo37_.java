package algo;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2346
 */
public class Algo37_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution();
		
	}

	static void solution() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int index = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		for (int i = 0; i < n; i++) {
			if ((i + list.get(index)) < 0) {
				index = list.size() + index + list.get(index);
				System.out.println(index);
				list.remove(index);
			} else {
				index = index + list.get(index);
				System.out.println(index + list.get(i));
				list.remove(index);
			}
		}

	}

}
