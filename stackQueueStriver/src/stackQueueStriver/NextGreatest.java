package stackQueueStriver;

import java.util.Scanner;
import java.util.Stack;

public class NextGreatest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		nextGreater(arr, n);
	}

	static void nextGreater(int arr[], int n) {

        Stack <Integer> s=new Stack<>();
        s.add(arr[0]);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int pg=s.isEmpty()?-1:s.peek();
            System.out.print(pg+" ");
            s.add(arr[i]);
        }
	}

}
