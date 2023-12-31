package hashing_Gfg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int a1[] = new int[m];
		int a2[] = new int[n];
		
		for(int i=0;i<a1.length;i++)
			a1[i]=sc.nextInt();
		for(int i=0;i<a2.length;i++)
			a2[i]=sc.nextInt();
		
		unionOfArrays(a1,a2);
	}

	static void unionOfArrays(int a1[], int a2[])
	{
		Set<Integer> h = new HashSet<>();
		
		for(int x:a1)
			h.add(x);
		for(int x:a2)
			h.add(x);
		
		System.out.print(h.size());
		
	}
}
