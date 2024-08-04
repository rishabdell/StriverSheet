package day9_recursion;

import java.util.ArrayList;
import java.util.List;

public class SubseqWithKSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1};
		List<Integer> li = new ArrayList<>();
		//printSubseqWithKSum(0,arr,li,arr.length,2,0);
		//printSubseqWithKSumOneSol(0,arr,li,arr.length,2,0);
		int res = countAllSubseqWithKSum(0,arr,li,arr.length,2,0);
		System.out.println(" "+res);
		
	}

	//Print all combintations with k sum
	private static void printSubseqWithKSum(int i, int[] arr, List<Integer> li, int n, int k, int sum) {
		// TODO Auto-generated method stub
		if(i==n)
		{
			if(sum==k)
			{
				System.out.println(li);
				
			}
			return;
		}
		sum+=arr[i];
		li.add(arr[i]);
		printSubseqWithKSum(i+1,arr,li,n,k,sum);
		li.remove(li.size()-1);
		sum-=arr[i];
		printSubseqWithKSum(i+1,arr,li,n,k,sum);
		
	}
	//Print only one combintation with k sum
	private static boolean printSubseqWithKSumOneSol(int i, int[] arr, List<Integer> li, int n, int k, int sum) {
		// TODO Auto-generated method stub
		if(i==n)
		{
			if(sum==k)
			{
				System.out.println(li);
				return true;
			}
			return false;
		}
		sum+=arr[i];
		li.add(arr[i]);
		if(printSubseqWithKSumOneSol(i+1,arr,li,n,k,sum))return true;
		li.remove(li.size()-1);
		sum-=arr[i];
		if(printSubseqWithKSumOneSol(i+1,arr,li,n,k,sum))return true;
		return false;
		
	}
	
	//Count all subsequences combintations with k sum
		private static int countAllSubseqWithKSum(int i, int[] arr, List<Integer> li, int n, int k, int sum) {
			// TODO Auto-generated method stub
			if(i==n)
			{
				if(sum==k)
				{
					//System.out.println(li);
					return 1;
				}
				return 0;
			}
			sum+=arr[i];
			li.add(arr[i]);
			int left = countAllSubseqWithKSum(i+1,arr,li,n,k,sum);
			sum-=arr[i];
			li.remove(li.size()-1);
			
			int right= countAllSubseqWithKSum(i+1,arr,li,n,k,sum);
			return left+right;
			
		}

}
