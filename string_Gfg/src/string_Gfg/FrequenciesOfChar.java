package string_Gfg;

import java.util.Scanner;

public class FrequenciesOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count[] = new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
		{
			System.out.print((char)(i+'a')+" "+count[i]);
		}
	}

}
