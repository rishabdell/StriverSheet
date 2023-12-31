package day2_array;

import java.util.Scanner;

public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]= new int[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]= sc.nextInt();
		
		setZero(arr);

	}
	static void setZero(int arr[][]) {
		
		int m=arr.length,n=arr[0].length,col0=1;
		
		for(int i=0;i<m;i++) {
			if(arr[i][0]==0)col0=0;
			for(int j=1;j<n;j++)
			{
				if(arr[i][j]==0)
					arr[i][0]=arr[0][j]=0;
			}
		}
		
		for(int i=m-1;i>=0;i--)
		{
			for(int j=n-1;j>=1;j--)
			{
				if(arr[i][0]==0||arr[0][j]==0)
				{
					arr[i][j]=0;
				}
					
			}
			if(col0==0)arr[i][0]=0;
		}
	}
	
	

}
