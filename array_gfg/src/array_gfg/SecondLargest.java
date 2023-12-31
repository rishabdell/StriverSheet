package array_gfg;

import java.util.Scanner;

public class SecondLargest {
	public static void main (String []args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();

		int res=-1,largest=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[largest])
			{
				res=largest;
				largest = i;
			}
			else if(arr[i]!=arr[largest])
			{
				if(res==-1||arr[i]>arr[res])
					res=i;
			}
		}
		System.out.print(arr[res]);
	}

}
