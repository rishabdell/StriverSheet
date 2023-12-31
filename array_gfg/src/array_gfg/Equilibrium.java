package array_gfg;

import java.util.Scanner;

public class Equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int rs=0,ps=0;
		for(int i=0;i<n;i++)
			rs+=arr[i];
		
		boolean flag = false;
		for(int i=0;i<n;i++)
		{
			rs-=arr[i];
			if(ps==rs)
			{
				flag = true;
				break;
			}
			ps+=arr[i];
		}
		
		System.out.print(flag);

	}

}
