package datastructure.stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void reverse(String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

	public static void main(String[] args) {

		reverse("rashmi");
		

	}

}
