package linked_List;

public final class LinkedListBasicOpr {

	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	void addFirst(int data) {
		Node temp = new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		temp.next=head;
		head =temp;
	}
	void addLast(int data) {
		Node temp = new Node(data);
		if(head == null)
		{
			head=temp;
			return;
		}
		Node curr = head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		
	}
	void atPos(int data,int pos)
	{
		Node temp = new Node(data);
		if(pos==0)
		{
			addFirst(data);
		}
		Node curr = head;
		if(pos==1)
		{
			temp.next=curr.next;
			curr.next=temp;
		}
		int i=0;
		while(curr.next!=null&& i<pos-1)
		{
			curr=curr.next;
			i++;
		}
		temp.next=curr.next;
		curr.next=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
