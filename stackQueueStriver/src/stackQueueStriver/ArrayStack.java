package stackQueueStriver;

public class ArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray st = new StackArray(6);
		st.push(98);
		st.push(99);
		st.push(100);
		st.pop();
		st.pop();
		System.out.println(st.size());
		System.out.println(st.isEmpty());
	}

}

class StackArray{
	int arr[];
	int cap;
	int top;
	StackArray(int c)
	{
		top=-1;
		cap =c;
		arr= new int[cap];
	}
	void push(int x)
	{
		top++;
		arr[top]=x;
	}
	void pop()
	{
		int res = arr[top];
		top--;
		System.out.println(res);
	}
	int size() {
		return top+1;
	}
	boolean isEmpty()
	{
		return (top==-1);
	}
}
