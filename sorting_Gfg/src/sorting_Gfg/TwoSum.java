package sorting_Gfg;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=  new int[n];
		int x =sc.nextInt() ;
		
		Arrays.sort(arr);
		int start =0;
		int end = n-1;
		
		while(start<=end)
		{
			if((arr[start]+arr[end])< x) start++;
			else if((arr[start]+arr[end])==x)
			{
				System.out.println("1st no "+start+" 2nd no "+end);
				break;
			}
			else end++;
		}
		
		
		

	}

}
