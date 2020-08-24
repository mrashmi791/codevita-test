package datastructure.doublylinkedlist;

class Node {
	int data;
	Node next , prev ;
	Node (int data) {
		this.data = data;
		this.prev = this.next = null;
	}
}
public class DoublyLinkedListDemo {

	static Node head = null;
	
	public static void addData(int d) {
		Node node = new Node(d);
		
		if(head == null) {
			node.next  = head;
			node.prev = null;
			
		} else {
			node.next  = head;
			head.prev =node;
		}
		head = node;
	}
	
	public static void  traverse() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void reverse() {
		Node curr = head;
		Node temp = null;
		
		while( curr != null) {
			temp = curr.prev; 
            curr.prev = curr.next; 
            curr.next = temp; 
            curr = curr.prev;
		}
		head = temp.prev;
		
	}
	public static void main(String[] args) {

		addData(5);
		addData(8);
		addData(55);
		addData(18);
		traverse();
		reverse();
		traverse();
		
	}

}
