package day9_recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {
	/*
	 * SubSequence:- A contiguous sequences, which follows the order
	 * Input:- 3,1,2
	 * Output:- [3],[1],[2],[3,1],[1,2],[3,2],[3,1,2]
	 * In above statement order means output cant be like [2,3],[1,3]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]= {3,1,2};
		List<Integer>li= new ArrayList<>();
		printAllSubseq(0,li,arr.length,arr);

	}

	private static void printAllSubseq(int i, List<Integer> li, int n, int[] arr) {
		// TODO Auto-generated method stub
		if(i>=n)
		{
			System.out.println(li);
			return;
		}
		li.add(arr[i]);
		printAllSubseq(i+1,li,n,arr);
		li.remove(li.size()-1);
		printAllSubseq(i+1,li,n,arr);
	}

}
