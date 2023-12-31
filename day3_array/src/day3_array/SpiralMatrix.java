package day3_array;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]= new int[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		
		spiralTraverse(arr, m,n);

	}
	
	static void spiralTraverse(int arr[][], int row,int col)
	{
		int left =0,top=0, bottom = col-1,right=row-1;
		
		while(left!=right && top!=bottom)
		{
			for(int i=left;i<right;i++)
					System.out.println(arr[top][i]);
			
			top++;
			
			for(int i= top;i<bottom;i++)
				
				System.out.print(arr[i][right]);
			
			right--;
			
			if(top!=bottom)
			{
				for(int i=right;i>=left;i--)
					System.out.print(arr[bottom][i]);
				
				bottom--;
				
			}
			if(left!=right)
			{
				for(int i=bottom;i>=top;i--)
					System.out.print(arr[i][left]);
				left++;
			}
			
		}
	}

}
