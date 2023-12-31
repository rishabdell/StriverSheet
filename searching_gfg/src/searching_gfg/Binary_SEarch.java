package searching_gfg;

import java.util.Scanner;

public class Binary_SEarch {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		int x= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int res = binarySearch(arr, n, x);
		
		System.out.print(res);
		
	}
	
	static int binarySearch(int arr[], int n,int x) {
		int low =0;
		int high = n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==x) return mid;
			else if(arr[mid]>x) high = mid-1;
			else low = mid+1;
			
		}
		return -1;
	}

}
