package sorting_Gfg;

import java.util.Scanner;

public class LomutoPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		quickSort(arr,0,n-1);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	static void quickSort(int arr[],int l,int h) {
		while(l<h) {
			int p = lomutoPartition(arr,l,h);
			quickSort(arr,l,p-1);
			quickSort(arr,p+1,h);
		}
	}
	
	static int lomutoPartition(int arr[],int l,int h)
	{
		int pivot = arr[h];
		int i = l-1;
		for(int j=l;j<h-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[j];
				arr[j]= arr[i];
				arr[i]=temp;
			}
			
		}
		int temp =arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		
		return i+1;
	}

}
