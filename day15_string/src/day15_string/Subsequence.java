package day15_string;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int j=0;
		for(int i=0;i<s1.length()&& j< s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(j)) j++;
			
		}
		
		boolean check = (j==s2.length());
		if(check) System.out.println(check);
		else System.out.println(check);

	}

}
