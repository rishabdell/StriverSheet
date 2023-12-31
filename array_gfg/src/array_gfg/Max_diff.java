package array_gfg;

import java.util.Scanner;

public class Max_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();
		
		System.out.println(maxDiff(n, arr));

	}
	static int maxDiff(int n, int arr[])
	{
		int res = arr[1]-arr[0], minValue = arr[0];
		for(int j=1;j<n;j++)
		{ 
			res = Math.max(res, arr[j]-minValue);
			minValue = Math.min(minValue, arr[j]);
		}
		return res;
	}

}
