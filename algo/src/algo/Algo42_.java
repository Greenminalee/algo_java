package algo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Algo42_ {

	public static void main(String[] args) {
		solution();

	}

	static void solution() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nominees = scan.nextInt();
		int nominee;
		Map<Integer, Integer> frame = new LinkedHashMap<Integer, Integer>();
		for (int i = 1; i <= nominees; i++) {
			nominee = scan.nextInt();
			if (frame.containsKey(nominee)) {
				frame.replace(nominee, frame.get(nominee) + 1);
			} else if (frame.size() >= n) {
				// 추천받은 횟수가 가장작은 학생이 두명이상구현 못함
				frame.remove(frame.keySet().toArray()[0]);
				frame.put(nominee, 1);
			} else {
				frame.put(nominee, 1);
			}
		}
		for (int i = 0; i < frame.keySet().toArray().length; i++)
			System.out.print(frame.keySet().toArray()[i] + " ");
	}
}
