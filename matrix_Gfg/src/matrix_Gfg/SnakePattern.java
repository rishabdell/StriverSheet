package matrix_Gfg;

import java.util.Scanner;

public class SnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][]= new int[m][n];
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]= sc.nextInt();
			}
		for(int i=0;i<arr.length;i++)	
				if(i%2==0)
				{for(int j=0;j<arr[0].length;j++)
					System.out.print(arr[i][j]+" ");
				}
				else {for(int j=arr[0].length-1;j>=0;j--)
					System.out.print(arr[i][j]+" ");	
				}	
	}

}
