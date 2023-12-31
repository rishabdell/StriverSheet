package day15_string;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] temp = s.toCharArray();
		
		reverseTheWords(temp);

	}

	private static void reverseTheWords(char[] temp) {
		// TODO Auto-generated method stub
		int start = 0;
		for(int end=0;end<temp.length;end++)
		{
			if(temp[end]==' ')
			{
				reverse(temp,start,end-1);
				start=end+1;
			}
		}
		reverse(temp,start,temp.length-1);
		reverse(temp,0,temp.length-1);
		
	}

	private static void reverse(char[] temp, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end)
		{
			char temp1=temp[start];
			temp[start]=temp[end];
			temp[end]=temp1;
			start++;end--;
		}
		
		
	}

}
