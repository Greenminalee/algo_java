package algo;
/*
 * https://www.acmicpc.net/problem/11866
 */
import java.util.*;
public class Algo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int i;
		int n;
		int k;	      
		
		i = 0;
		n = sc.nextInt();
		k = sc.nextInt();
		while (i < n)
		{
			list.add(i +1);
			i++;
		}
		i = 0;
		System.out.print("<");
		while (list.size() != 0)
		{
			i += k - 1;
			i %= list.size();
			System.out.print(list.get(i));
			list.remove(i);
			if (list.size() != 0)
				System.out.print(", ");
		}
		System.out.print(">");
	}
}
