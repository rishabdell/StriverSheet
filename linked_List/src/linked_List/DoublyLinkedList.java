package linked_List;

public class DoublyLinkedList {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			next =null;
			prev =null;
		}
	}
	void insertAtBegin(int data)
	{
		Node temp = new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		temp.next = head;
		head.prev = temp;
		
		
	}
	
	void insertAtGiven(int data, int pos)
	{
		Node temp = new Node(data);
		
		if(head==null)
		{
			head=temp;
			return;
		}
		Node curr = head;
		int i=0;
		while(curr.next!=null && i<pos-1)
		{
			curr= curr.next;
			i++;
		}
		temp.prev=curr;
		temp.next=curr.next;
		curr.next=temp;
		temp.next.prev=temp;
		
	}
	void insertAtEnd(int data) {
		Node temp = new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node curr =head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		temp.prev=curr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
