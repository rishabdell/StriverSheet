package day9_recursion;

public class General_problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		sumOfFirstNnumbers(n,0);
		int x= sumWithFunctionalWay(n);
		int y= factorialWithFunctionalWay(5);
		System.out.println("Result 2 :- "+x);
		System.out.println("Result 3 :- "+y);
	

	}

	private static int factorialWithFunctionalWay(int n) {
		// TODO Auto-generated method stub
		if(n<=1) return 1;
		
		return ( n*factorialWithFunctionalWay(n-1));
		
	}

	//Functional way
	private static int sumWithFunctionalWay(int n) {
		// TODO Auto-generated method stub
		if(n<1)return 0;
		return n+sumWithFunctionalWay(n-1);
	}

	// Parameterised way
	private static void sumOfFirstNnumbers(int i,int sum) {
		// TODO Auto-generated method stub
		if(i<1 )
			{
			System.out.println(sum);
			return ;
			}
			
		 sumOfFirstNnumbers(i-1,sum+i) ;
	}
	
	

}
