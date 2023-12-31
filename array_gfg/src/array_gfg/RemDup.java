package array_gfg;

import java.util.Scanner;

public class RemDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] =sc.nextInt();
		
		int res=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		
		for(int i=0;i<res;i++)
			System.out.print(arr[i]+" ");
		

	}

}
