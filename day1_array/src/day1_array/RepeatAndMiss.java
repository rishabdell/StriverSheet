package day1_array;

import java.util.Scanner;

public class RepeatAndMiss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		int aux[] = new int[n];
		
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			aux[arr[i]]++;
		
		for(int i=0;i<n;i++)
		{
			if(aux[i]==1)continue;
			else if(aux[i]>1) System.out.println("Repeating No :- "+i);
			else System.out.println("Missing No :- "+i);
		}
		int repeat=withSlowAndFast(arr);	

		System.out.println("Repeat With Slow Fast "+repeat);
	}
	
	static int withSlowAndFast(int arr[]) { // this will not work if array have 0 or negative numbers.
		
		int slow=arr[0], fast=arr[0];
		do{
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast) ;
		
		slow=arr[0];
		while(slow!=fast) {
			slow=arr[slow];
			fast=arr[fast];
		}
		
		return slow;
	}

}
