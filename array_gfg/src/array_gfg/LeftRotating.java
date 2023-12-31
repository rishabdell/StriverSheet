package array_gfg;

import java.util.Scanner;

public class LeftRotating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int d = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		leftRotateArray(n, arr, d);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	
		

	}
	static void leftRotateArray(int n,int arr[], int d) {
		reverse(arr, 0, d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	static void reverse(int arr[], int start,int end) {
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}

}
