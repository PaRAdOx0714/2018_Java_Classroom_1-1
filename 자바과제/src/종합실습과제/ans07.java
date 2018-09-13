package 종합실습과제;

import java.util.*;

public class ans07 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("두 정수: " + a + "," + b);
		System.out.println("a AND b:" + (a & b));
		System.out.println("a OR b: " + (a | b));
		System.out.println("NOT a: " + ~a);
		System.out.println("a XOR b: " + (a^b));
		System.out.println("a NAND b: " + ~(a & b));
		System.out.println("a NOR b: " + ~(a | b));
	}

}
