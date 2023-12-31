package string_Gfg;

import java.util.Scanner;

public class ReverseWordsInLine {
	public static void main(String args[]) 
    {  
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char str[]= s.toCharArray();
		
		int n= str.length;
		reverseWords(str,n);
		
		System.out.print(str);
		
    } 
	static void reverseWords(char str[], int n)
	{
		int start=0;
		for(int end=0;end<n;end++)
		{
			if(str[end]==' ')
			{
				reverse(str, start,end-1);
				start = end+1;
			}
			
		}
		reverse(str,start,n-1);
		reverse(str,0,n-1);
	}
	static void reverse(char str[],int start,int end)
	{
		while(start<end)
		{
			char temp = str[start];
			str[start]=str[end];
			str[end]= temp;
			start++;end--;
		}
	}
}
