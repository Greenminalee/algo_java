package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Algo45 {

	public static void main(String[] args) {
		solution();
	}

	static void solution() {
		Scanner scan = new Scanner(System.in);
		int members_num = 0;
		int n = scan.nextInt(), m = scan.nextInt();
		ArrayList<String> team = new ArrayList<String>();
		Set<String>[] members = new HashSet[n];

		for (int i = 0; i < n; i++) {
			members[i] = new HashSet<String>();
			team.add(scan.next());
			members_num = scan.nextInt();
			for (int j = 0; j < members_num; j++) {
				members[i].add(scan.next());
			}
		}

		for (int i = 0; i <= m; i++) {
			String name = scan.next();
			int question = scan.nextInt();
			if (question == 0) {
				LinkedList<String> list = new LinkedList<String>(members[team.indexOf(name)]);
				Collections.sort(list);
				for (int j = 0; j < list.size(); j++)
					System.out.println(list.get(j));
			} else if (question == 1) {
				for (int j = 0; j < members_num; j++) {
					if (members[j].contains(name)) {
						System.out.println(team.get(j));
						break;
					}
				}

			}
		}
	}

}
