package sorting_Gfg;

import java.util.Scanner;

public class HoareQuick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		quickSort(arr,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	static void quickSort(int arr[],int l,int h) {
		if(l<h) {  
			int p = hoarePartition(arr,l,h);
			quickSort(arr,l,p);
			quickSort(arr,p+1,h); 
		}
	}
	static int hoarePartition(int arr[],int l,int h)
	{
		int pivot = arr[l];
		int start = l-1;
		int end = h+1;
		while(true) {
			do {
				start++;
			}while(arr[start]<pivot);
			do {
				end--;
			}while(arr[end]>pivot);
			if(end>=start) return end;
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;	
		}
	}
}
