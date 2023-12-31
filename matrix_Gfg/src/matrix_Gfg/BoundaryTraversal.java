package matrix_Gfg;

import java.util.Scanner;

public class BoundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int mat[][]= new int[R][C];
		
		for(int i=0;i<R;i++)
			for(int j=0;j<C;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		if(R == 1)
		{
			for(int i = 0; i < C; i++)
				System.out.print(mat[0][i] + " ");
		}
		else if(C == 1)
		{
			for(int i = 0; i < R; i++)
				System.out.print(mat[i][0] + " ");
		}
		else
		{
			for(int i = 0; i < C; i++)
				System.out.print(mat[0][i] + " ");
			for(int i = 1; i < R; i++)
				System.out.print(mat[i][C - 1] + " ");
			for(int i = C - 2; i >= 0; i--)
				System.out.print(mat[R - 1][i] + " ");
			for(int i = R - 2; i >= 1; i--)
				System.out.print(mat[i][0] + " ");
		}
		
	}

}
