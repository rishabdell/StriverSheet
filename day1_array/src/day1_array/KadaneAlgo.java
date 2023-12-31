package day1_array;

import java.util.Scanner;

public class KadaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int mE=findMaxSum(arr);
		System.out.print(mE);
	}
	
	static int findMaxSum(int arr[]) {
		int res=arr[0],maxEnding=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			maxEnding=Math.max(arr[i], arr[i]+ maxEnding);
			res=Math.max(maxEnding, res);
		}
		return res;
	}

}
