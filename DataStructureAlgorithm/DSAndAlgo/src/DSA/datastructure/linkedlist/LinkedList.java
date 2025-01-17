package DSA.datastructure.linkedlist;

public class LinkedList {

	static class Node{
		
		Object data;
		Node next;
		Node(Object d){
			data = d;
		}
	}
	
	
	
	//1.Display............................
	public void display(Node head){
		
	 /*
		  IF WE WONT USE THIS => Node temp = head;
		  then the head goes to end and we cant again 
		  loop through it. 
	 */
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}	
	}
	

	//2.Display Reverse...................
	public static void displayR(Node head){
	
		Node temp = head;
		if(temp==null) return;
		
		/*
		  displayR(temp.next); => Print in Reverse if we use before SOP.
		*/
		System.out.print(temp.data+"->");
		displayR(temp.next);
	}
	
	//3.Display Reverse...................
	public static int size(Node head){
		
		int len = 0;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			len++;
		}
		return len;
	}	
	
	public static void main(String... args){
	
		LinkedList l = new LinkedList();
		
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		l.display(a);
		System.out.println();
		displayR(a);
		System.out.println();
		System.out.println(l.size(a));
		
		//System.out.println(a.next);
		//System.out.println(b);
		//System.out.println(b.data);
		
	}
	
}
