package 종합실습과제;

import java.util.*;

public class ans08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		int a;
		a = sc.nextInt();
		
		System.out.println("정수: " + a);
		System.out.println("절댓값: " + (a<0?(a*-1):a));
		

	}

}
