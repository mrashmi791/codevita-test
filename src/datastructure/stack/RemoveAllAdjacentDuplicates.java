package datastructure.stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

	 public static String removeDuplicates(String S) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder sb= new StringBuilder();
	        
	        for(char c : S.toCharArray()) {
	            if(!stack.isEmpty() && stack.peek() == c) {
	                stack.pop();
	            } else {
	                stack.push(c);
	            }
	        }
	        while(!stack.isEmpty()) {
	           sb.append(stack.pop()); 
	        }
	        return sb.reverse().toString();
			
	    }
	 
	public static void main(String[] args) {

		String duplicates = removeDuplicates("abbaca");
		System.out.println(duplicates);
	}

}
