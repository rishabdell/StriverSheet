package sorting_Gfg;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of 1st Array ");
		int m = sc.nextInt();
		System.out.println("Enter Size of 2nd Array ");
		int n = sc.nextInt();
		
		int a1[] = new int[m];
		int a2[] = new int[n];
		System.out.println("Enter Values of 1st Array ");
		for(int i=0;i<m;i++)
		{
			a1[m]= sc.nextInt();
		}
		System.out.println("Enter Values of 2nd Array ");
		for(int i=0;i<n;i++)
		{
			a2[n]= sc.nextInt();
		}

		Arrays.sort(a1);
		Arrays.sort(a2);
		
		mergeTheArrays(a1,a2,m,n);
	}
	
	static void mergeTheArrays(int a1[],int a2[], int m, int n)
	{
		int i=0,j=0;
		while(i<m && j<n)
		{
			if(a1[i]<=a2[j]) 
			{
				System.out.print(a1[i]);
				i++;
			}
			else {
				System.out.print(a2[j]);
				j++;
			}
		}
		
		while(i<m)
		{
			System.out.print(a1[i]);i++;
		}
		while(j<n)
		{
			System.out.print(a2[j]);j++;
		}
	}

}
