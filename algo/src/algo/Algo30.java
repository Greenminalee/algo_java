package algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/*
 * 놀라운 문자열
 * https://www.acmicpc.net/problem/1972
 */

public class Algo30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> strs = new ArrayList<String>();
		String str = "";
		while(!str.equals("*")) {
			str = scan.nextLine();
			strs.add(str);
		}
		for(int i = 0; i < strs.size() - 1; i++) {
			solution(strs.get(i));
		}
	}

	static void solution(String str) {
		int len = str.length();
		LinkedList<String> list = new LinkedList<String>();
		String tmp = "";
		for (int i = 1; i < len; i++) {
			list.clear();
			for (int j = 0; j < len; j++) {
				tmp = "";
				if (i + j < len) {
					tmp += str.charAt(j);
					tmp += str.charAt(i + j);
					if (list.contains(tmp)) break;
					else list.add(tmp);					
				}
			}
			if (list.contains(tmp)) break;
		}
		if(list.contains(tmp))
			System.out.println(str + " is NOT surprising.");
		else
			System.out.println(str + " is surprising.");
	}
}
