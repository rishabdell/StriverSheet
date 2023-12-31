package string_Gfg;

import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		int j=0;
		for(int i=0;i<str1.length() && j<str2.length();i++)
		{
			if(str1.charAt(i)==str2.charAt(j))
				j++;
		}
		if(j==str2.length())
			System.out.print(true);

	}

}
