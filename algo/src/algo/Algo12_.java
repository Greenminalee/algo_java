package algo;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 * https://www.acmicpc.net/problem/11729
 */
public class Algo12_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();
		int size  = stack1.size();
		
		for(int i = N; i > 0; i--)
			stack1.add(i);
		stack3.add(stack1.pop());
		stack2.add(stack1.pop());
		solution(stack1, stack2, stack3, size);
	}
	
	static Stack<Integer> solution(Stack<Integer> stack1, Stack<Integer> stack2, Stack<Integer> stack3, int size)
	{
		int move = 0;
		if(stack3.size() == size)
			return stack3;
		
		if((stack1.peek() < stack3.peek()) || (stack3.size() == 0))	
			stack3.add(stack1.pop());
		else if((stack1.peek() < stack2.peek()) || (stack2.size() == 0))	
			stack2.add(stack1.pop());
		else if((stack2.peek() < stack3.peek()) || (stack3.size() == 0))	
			stack3.add(stack2.pop());
		else if((stack2.peek() < stack1.peek()) || (stack1.size() == 0))	
			stack1.add(stack2.pop());
		else if((stack3.peek() < stack1.peek()) || (stack1.size() == 0))	
			stack1.add(stack3.pop());
		else if((stack3.peek() < stack2.peek()) || (stack1.size() == 0))	
			stack2.add(stack3.pop());
		
		return 	solution(stack1, stack2, stack3, size);
	}
}
