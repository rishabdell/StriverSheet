package day4_Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.print(lcs(arr));

	}
	static int lcs(int arr[])
	{
		Set<Integer> hashSet = new HashSet<Integer>();
		int longestStreak =0;
		for(int num: arr)
			hashSet.add(num);
		
		for(int num: arr)
		{
			if(!hashSet.contains(num-1))
			{
				int currNum= num;
				int currStreak = 1;
				while(hashSet.contains(currNum+1))
				{
					currNum+=1;
					currStreak+=1;
				}
				longestStreak = Math.max(currStreak, longestStreak);
				
			}
		}
		return longestStreak;
	}

}
