package sorting_Gfg;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		
		mergeSort(arr,0,n-1);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	static void mergeSort(int arr[], int l,int h)
	{
		while(l<h)
		{
			int mid = (l+h)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			mergeSortAlgo(arr,l,mid,h);
		}
	}
	static void mergeSortAlgo(int arr[],int l, int m, int h) {
		int n1 = m-l+1;int n2=h-m;
		int left[]= new int[n1];
		int right[]= new int[n2];
		
		for(int i=0;i<n1;i++)
			left[i]=arr[l+i];
		
		for(int j=0;j<n2;j++)
		    right[j]= arr[m+1+j];
		
		int i=0,j=0,k=l;
		
		while(i<n1 &&j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k] = left[i];i++;k++;
			}
			else {
				arr[k]=right[j];j++;k++;
			}
		}
		while(i<n1) {
			arr[k]=left[n1];i++;k++;
		}
		while(j<n2)
		{
			arr[k]=right[n2];j++;k++; 
		}
	}

}
