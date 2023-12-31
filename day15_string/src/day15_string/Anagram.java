package day15_string;

import java.util.Collections;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
		n=n.toLowerCase();
		m=m.toLowerCase();
		int arr[] = new int[26];
		
		for(int i=0;i<n.length();i++)
		{
			arr[n.charAt(i)-'a']++;
		}
		for(int i=0;i<m.length();i++)
		{
			arr[m.charAt(i)-'a']--;
		}
		
		int flag=0;
		
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0)
			{
				flag=1; break;
			}
		}
		
		if(flag==1)System.out.println("Not Anagram");
		else System.out.println("Anagram");
		
		
	}

}
