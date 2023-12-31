package array_gfg;

import java.util.Scanner;

public class Circular_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int ns =normalSum(arr,n);
		int cs =circularSum(arr,n);
		System.out.println("Normal Sum = "+ns+" Circular Sum = " +cs);
	}
	static int normalSum(int arr[], int n)
	{
		int res = arr[0],maxVal =arr[0];
		for(int i=1;i<n;i++)
		{
			maxVal= Math.max(arr[i], arr[i]+maxVal);
			res = Math.max(maxVal, res);
		}
		
		return res;
	}
	static int circularSum(int arr[], int n)
	{
		int max_normal = normalSum(arr,n);
		if(max_normal<0)
			return max_normal;
		
		int sum=0;
		for(int i=0;i<n;i++)        // To find min sum in our original array
		{
			sum+=arr[i];
			arr[i]=-arr[i];			// So here we inverted the elements
		}
		int max_circular = sum+normalSum(arr,n); // From here we get the min sum of original array
		
		return Math.max(max_normal,max_circular);
	}
}
