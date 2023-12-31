package searching_gfg;

import java.util.Scanner;

public class FirstLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int x = sc.nextInt();
		
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();
		
		int first=firstOccurence(arr,0,n-1,x);
		int last=lastOccurence(arr,0,n-1,x);

	}
	static int firstOccurence(int arr[], int l, int h, int x)
	{
		int mid = (l+h)/2;
		if(arr[mid]>x)return firstOccurence(arr,l,mid-1,x);
		else if(arr[mid]<x) firstOccurence(arr,mid+1,h,x);
		else {
			if(mid==0 || arr[mid]!=arr[mid-1])
				return mid;
			return firstOccurence(arr,l,mid-1,x);
		}
		return -1;
	}
	static int lastOccurence(int arr[], int l, int h, int x)
	{
		int mid = (l+h)/2;
		if(arr[mid]>x)return lastOccurence(arr,l,mid-1,x);
		else if(arr[mid]<x) lastOccurence(arr,mid+1,h,x);
		else {
			if(mid==h-1 || arr[mid]!=arr[mid+1])
				return mid;
			return lastOccurence(arr,mid+1,h,x);
		}
		return -1;
	}

}
