package array_gfg;

import java.util.Scanner;

public class Gcd_Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = gcd(a,b);
		int lcm = (a*b)/x;
		
		System.out.println("LCM: "+lcm+" GCD: "+x);
		
	}
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

}
