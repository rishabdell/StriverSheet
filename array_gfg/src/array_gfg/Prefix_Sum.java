package array_gfg;

import java.util.Scanner;

public class Prefix_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		int l = sc.nextInt();
		int r= sc.nextInt();
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int prefSum[] = new int[n];
		
		prefSum[0]=arr[0];
		
		for(int i=1;i<n;i++)
		{
			prefSum[i]= prefSum[i-1]+arr[i];
		}
		
		int pSum=getSum(l,r,prefSum);
		System.out.print(pSum);
		

	}
	static int getSum(int l ,int r, int prefSum[])
	{
		if(l==0)
			return prefSum[r];
		
		return (prefSum[r]-prefSum[l-1]);
	}

}
