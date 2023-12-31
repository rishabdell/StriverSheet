package hashing_Gfg;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		distinct(arr);

	}

	static void distinct(int arr[]) {
		HashSet<Integer> s = new HashSet<>(); 
		for(int i=0;i<arr.length;i++)
			s.add(arr[i]);
		
		System.out.print(s.size());
	}
}
