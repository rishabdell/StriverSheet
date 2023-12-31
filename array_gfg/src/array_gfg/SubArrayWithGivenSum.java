package array_gfg;

import java.util.Scanner;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		int sum = sc.nextInt(); 
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int e,s=0;
		int curr=0;
		boolean flag = false;
		for(e=0;e<n;e++)
		{
			curr+=arr[e];
			while(sum<curr)
			{
				curr-=arr[s];
				s++;
			}
			if(curr==sum)
			{
				flag =true;
				break;
			}
		}
		System.out.print(flag);

	}

}
