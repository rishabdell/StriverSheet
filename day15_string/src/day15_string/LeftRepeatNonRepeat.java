package day15_string;

import java.util.Scanner;

public class LeftRepeatNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		s1=s1.toLowerCase();
		
		int ch[] = new int[26];
		
		for(int i=0;i<s1.length();i++)
			{
			  ch[s1.charAt(i)-'a']++;
			}
		
		leftRepeat(s1,ch);
		leftNonRepeat(s1,ch);

	}
	private static void leftNonRepeat(String s1, int[] ch) {
		// TODO Auto-generated method stub
		for(int i=0;i<s1.length();i++)
		{
			if(ch[s1.charAt(i)-'a']==1)
			{
				System.out.println("Leftmost Non-Repeating Character:- "+s1.charAt(i));
				break;
			}
		}
		
	}
	static void leftRepeat(String s1, int[] ch)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(ch[s1.charAt(i)-'a']>1)
			{
				System.out.println("Leftmost Repeating Character:- "+s1.charAt(i));
				break;
			}
		}
	}

}
