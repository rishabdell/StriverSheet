package array_gfg;

import java.util.Scanner;

public class ZeroToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count =0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]= arr[count];
				arr[count]= temp;
				count++;
			}
		}
		
		for(int i=0;i<count;i++)
			System.out.print(arr[i]+" ");

	}

}
