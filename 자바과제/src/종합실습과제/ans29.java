package 종합실습과제;

import java.util.Scanner;

public class ans29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,i,GCD;
		GCD=0;
		System.out.print("자연수 3개: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int result = min(a,b,c);
		for(i = 2; i<=result; i++) 
			if(a%i==0 && b%i==0 && c%i==0) 
				GCD=i;
		System.out.println("최대공약수(GCD): " + GCD);
		sc.close();

		
		}
	
	
	public static int min(int a, int b, int c) {
		int max = a<b?a:b;
		int res = max<c?max:c;
		return res;
	}

}
