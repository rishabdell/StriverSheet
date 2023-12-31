package day1_array;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n =sc.nextInt();
		int a1[]= new int[m];
		int a2[]= new int[n];
		
		for(int i=0;i<m;i++)
			a1[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			a2[i]=sc.nextInt();
		}
		
		mergeSortedArray(a1,a2);

	}
	static void mergeSortedArray(int a1[],int a2[])
	{
		int m=a1.length,n=a2.length,i=0,j=0;
		
		while(i<m&&j<n)
		{
			if(a1[i]<=a2[j]) {
				System.out.println(a1[i]);
				i++;
			}
			else {
				System.out.println(a2[j]);
				j++;
			}
		}
		
		while(i<m)
		{
			System.out.println(a1[i]);
			i++;
		}
		while(j<n)
		{
			System.out.println(a2[j]);
			j++;
		}
	}

}
