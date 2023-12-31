package day2_array;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]= new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		}
		
		rotation(arr);

	}
	
	static void rotation(int matrix[][])
	{
		  int m=matrix.length,n=matrix[0].length;

	        for(int i=0;i<m;i++)
	        {
	            for(int j=i;j<n;j++)
	            {
	                int temp=0;
	                temp=matrix[i][j];
	                matrix[i][j]=matrix[j][i];
	                matrix[j][i]=temp;
	            }
	        }
	        
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m/2;j++)
				{
					int temp=0;
	                temp=matrix[i][j];
					matrix[i][j]=matrix[i][m-1-j];
					matrix[i][m-1-j]=temp;
					
				}
			}
	}


}
