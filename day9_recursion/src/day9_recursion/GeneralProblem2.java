package day9_recursion;

public class GeneralProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,6,70,15,87};
		
		swapByRecur(arr,0,arr.length-1);
		swapByRecur2(arr,0,arr.length);
		
		String str = "XYZZYX";
		boolean res=palindromeCheck(str,0,str.length());
		System.out.println ("Is Palindrome:- "+ res);
		
//		for(int x:arr)
//		{
//			System.out.println("Result :- "+ x);
//		}

	}

	private static boolean palindromeCheck(String str, int i, int n) {
		// TODO Auto-generated method stub
		if(i>=n/2) return true;
		if(str.charAt(i)!=str.charAt(n-i-1))return false;
		
		return palindromeCheck(str,i+1,n);
		
	}

	private static void swapByRecur(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if(l>=r) return;
		
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		
		swapByRecur(arr,l+1,r-1);
		
	}
	
	private static void swapByRecur2(int[] arr, int i, int n) {
		// TODO Auto-generated method stub
		if(i>=n/2) return;
		
		int temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
		
		swapByRecur2(arr,i+1,n);
		
	}

}
