package stackQueueStriver;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		printStockSpan(arr,n);
	}
	
	static void printStockSpan(int arr[], int n) {
		  Stack<Integer> s=new Stack<>() ;
	        s.add(0);
	        System.out.print(1+" ");
	        for(int i=1;i<n;i++){
	            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
	                s.pop();
	            }
	            int span=s.isEmpty() ? i+1 : i-s.peek();
	            System.out.print(span+" ");
	            s.push(i);
	        }    
	}
}
