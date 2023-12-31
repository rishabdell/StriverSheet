package searching_gfg;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int x = sc.nextInt();
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int low =0;
		int high = n-1;
		boolean flag = false;
		while(low<=high)
		{
			if((arr[low]+arr[high])>x)high--;
			else if(arr[low]+arr[high]<x)low++;
			else flag = true;
		}
		
		System.out.print(flag);

	}

}
