package 종합실습과제;

import java.util.Scanner;

public class ans02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("두 정수:" + a + " " + b);
		System.out.println("몫:" + a/b);
		System.out.println("나머지:" + a%b);

	}

}
