package array_gfg;

import java.util.Scanner;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();
		
		int profit =0;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[i-1])
			{
				profit+=(arr[i]-arr[i-1]);
			}
		}
		
		System.out.print(profit);
	}

}
