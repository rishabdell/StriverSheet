package searching_gfg;

import java.util.Scanner;

public class SearchSortedCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int x = sc.nextInt();
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		searchSortedCircular(arr,n, x);

	}
	static int searchSortedCircular(int arr[], int n,int x)
	{
		int low =0,high = n-1;
		while(low<high)
		{
			int mid = (low+high)/2;
			if(arr[mid]==x)return mid;
			if(arr[low]<=arr[mid])
			{
				if(x>=arr[low] && x<arr[mid])
				{
					high = mid-1;
				}									// Checking if left hand is sorted
				else {
					low = mid+1;
				}
			}
			else {
				if(x>arr[mid] && x<= arr[high])
				{
					low = mid-1;
				}									// Check if right hand is sorted
				else {
					high = mid+1;
				}
			}
		}
		return -1;
	}

}
