package string_Gfg;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int a1[]= new int[256];
	

		if(a.length()!=b.length()) System.out.println("Not Anagram");
		
		for(int i=0;i<a.length();i++)
		{
			a1[a.charAt(i)]++;
			a1[b.charAt(i)]--;
			
		}
		boolean flag = false;
		for(int i=0;i<256;i++)
		{
			if(a1[i]!=0)
			{
				flag=false;
				break;
			}
		flag= true;
		}
		System.out.print("Anagram "+flag);
	}
	

}
