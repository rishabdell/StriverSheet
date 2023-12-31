package day1_array;

import java.util.Scanner;

public class SortThreeElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] =sc.nextInt();
		
		sortElements(arr);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");;

	}
	
	static void sortElements(int arr[])
	{
		int low=0,mid=0,high=arr.length-1;
		
		while(mid<=high) {
			if(arr[mid]==0)
			{
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else {
				swap(arr,mid,high);
				high--;
			}
		}
	}
	static void swap(int arr[],int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	

}
