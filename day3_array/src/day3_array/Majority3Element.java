package day3_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Majority3Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		List<Integer> res=majorityElement(arr,n);
		
	
			System.out.println(res);
	
		

	}
	static List<Integer> majorityElement(int arr[], int n)
	{
		int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE,c1=0,c2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==ele1)c1++;
			else if(arr[i]==ele2)c2++;
			else if(c1==0)
			{
				ele1=arr[i];
				c1=1;
			}
			else if(c2==0)
			{
				ele2=arr[i];
				c2=1;
			}
			else {
				c1--;c2--;
			}
		}
		List<Integer> results = new ArrayList<Integer>();
		c1=0;c2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==ele1)c1++;
			else if(arr[i]==ele2)c2++;

		}
		if(c1>(n/3)) results.add(ele1);
		if(c2>(n/3))results.add(ele2);
		return results;
	}
	

}
