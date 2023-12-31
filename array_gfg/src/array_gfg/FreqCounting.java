package array_gfg;

import java.util.Scanner;

public class FreqCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int i=1,freq=1;
		while(i<n)
		{
			while(i<n && arr[i]==arr[i-1])
			{
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			
			i++;
			freq=1;
		}
		if(i==1 || arr[n-1]!=arr[n-2])                     // for printing count of last element
		{
			System.out.print(arr[n-1]+" "+"1");
		}
	}

}
