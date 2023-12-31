package matrix_Gfg;

import java.util.Scanner;

public class MatrixSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n=sc.nextInt();
		int arr[][]= new int[m][n];
		int x =sc.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		}
		int i=0;
		int j=n-1;
		while(i<m && n>=j)
		{
			if(arr[i][j]==x)
			{
				System.out.print(i+" "+j);
				break;
			}
			else if(arr[i][j]>x)
			{
				j--;
			}
			else {
				i++;
			}
		}
	}

}
