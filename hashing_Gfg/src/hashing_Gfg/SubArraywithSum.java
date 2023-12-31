package hashing_Gfg;

import java.util.HashSet;
import java.util.Scanner;

public class SubArraywithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int sum = sc.nextInt();
		
		for(int i=0;i<n;i++)
			 arr[i]=sc.nextInt();
		
		subArraySum(arr,sum);
		
	}
	static boolean subArraySum(int arr[], int sum)
	{
		HashSet<Integer> h = new HashSet<>();
		int prefixSum =0;
		for(int x:arr)
		{
			prefixSum+=x;
			if(prefixSum==sum)return true;
			if(h.contains(prefixSum-sum)) return true;
			h.add(x);
		}
		return false;
	}
}
