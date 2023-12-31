package day15_string;

import java.util.Scanner;

public class NaivePatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		String patt=sc.next();
		
		improvedDistinctPatternSearch(txt,patt);
		

	}

	private static void improvedDistinctPatternSearch(String txt, String patt) {
		// TODO Auto-generated method stub
		for(int i=0;i<txt.length()-patt.length();)  //  Here we shifted the iteration of i comparing to naive approach
		{
			int j;
			for( j=0;j<patt.length();j++)
				if(patt.charAt(j)!=txt.charAt(i+j))break;
			if(j==patt.length()) System.out.println(i);
			if(j==0)i++;						  //  to here
			else i=(i+j);						 // here we are incrementing i wrt to given pattern to be searched
		}
	}

}
