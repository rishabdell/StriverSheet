package day3_array;

import java.util.Scanner;

public class Search2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]= new int[m][n];
		int x =sc.nextInt();
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		}
		
		search2d(arr,m,n,x);

	}
	
	static int search2d(int arr[][], int m, int n,int x)
	{
		int row=0,col=n-1;
		while(row<m && col>=0)
		{
			if(arr[row][col]==x) return arr[row][col];
			else if(arr[row][col]<x)
			{
				row++;
			}
			else col--;
		}
		return -1;
	}
	 public boolean searchMatrixLeetcode(int[][] matrix, int target) {
	        int n= matrix.length;
	        int m = matrix[0].length;
	        int lo=0;
	        int hi =(n*m)-1;

	        while(lo<=hi)
	        {
	            int mid =(lo+(hi-lo)/2);

	            if(matrix[mid/m][mid % m]==target) return true;
	            else if(matrix[mid/m][mid % m]<target) lo =mid+1;
	            else hi=mid-1;
	        }
	      return false;
	    }

}
