package hashing_Gfg;

import java.util.HashSet;
import java.util.Scanner;

public class PairWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr[] = new int[m];
		int sum = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		pairSum(arr,sum);

	}
	 static boolean pairSum(int arr[],int sum)
	 {
		 HashSet<Integer> h = new HashSet<>();
		 
		 for(int x:arr)
		 {
			 if(h.contains(sum-x)) return true;
			 else h.add(x);
		 }
		return false; 
	 }

}
