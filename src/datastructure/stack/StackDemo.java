package datastructure.stack;

import java.util.Stack;

class Node {
	Node next;
	int data;
	Node(int data) {
		this.data = data;
	}
}


public class StackDemo {

	static Node top = null;
	
	public static void push(int d) {
		Node node = new Node(d);
		node.next = top;
		top = node;
	
		
	}
	
	public static void traverse() {
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	
	
	
	public static int peek() {
		return top.data;
	}
	
	public static void pop() {

		if(top == null) {
			System.out.println("No element found");
			return;
		}
		top = top.next;
	}
	
	public static void main(String[] args) {

		push(9);
		push(4);
		traverse();
		
		
	}

}
