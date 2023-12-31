package day15_string;

import java.util.Scanner;

public class RabinKarpAlgo {
	 static final int d=256;
	    static final int q=101;  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.next();
		
		System.out.print("All index numbers where pattern found: ");
		rbPattSearch(s1,s2,s1.length(),s2.length());

	}

	private static void rbPattSearch(String txt, String pat, int N, int M) {
		// TODO Auto-generated method stub
		 //Compute (d^(M-1))%q
	    int h=1;
	    for(int i=1;i<=M-1;i++)
	        h=(h*d)%q;
	    
	    //Compute p and to
	    int p=0,t=0;
	    for(int i=0;i<M;i++){
	        p=(p*d+pat.charAt(i))%q;
	        t=(t*d+txt.charAt(i))%q;
	    }
	    
	    for(int i=0;i<=(N-M);i++){
	       //Check for hit
	       if(p==t){
	           boolean flag=true;
	           for(int j=0;j<M;j++)
	                if(txt.charAt(i+j)!=pat.charAt(j)){flag=false;break;}
	            if(flag==true)System.out.print(i+" ");
	       }
	       //Compute ti+1 using ti
	       if(i<N-M){
	           t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+M))%q;
	        if(t<0)t=t+q;
	       }
	    }
	}

}
