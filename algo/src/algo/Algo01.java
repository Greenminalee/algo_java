package algo;

/*
https://www.acmicpc.net/problem/2439
*/

public class Algo01 {

	public static void main(String[] args) {
		int i;
		int j;

		i = 0;
		while (i < 5) {
			j = 4;
			while (j >= 0) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
				j--;
			}
			System.out.println("");
			i++;

		}
	}

}
