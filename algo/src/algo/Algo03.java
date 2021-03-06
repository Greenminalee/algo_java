package algo;

/*
 *	https://programmers.co.kr/learn/courses/30/lessons/43165
 */
public class Algo03 {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int target = 3;
		int sum = 0;
		System.out.println(dfs(numbers, 0, 0, target));
	}

	private static int dfs(int[] numbers, int node, int sum, int target) {
		if (node == numbers.length) {
			if (sum == target)
				return 1;
			return 0;
		}
		return dfs(numbers, node + 1, sum + numbers[node], target)
				+ dfs(numbers, node + 1, sum - numbers[node], target);
	}
}