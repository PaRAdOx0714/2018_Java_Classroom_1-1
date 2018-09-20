package 종합실습과제;

import java.util.Scanner;

public class ans17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=b;i>=a;i--)
			System.out.print(i+" ");
		sc.close();
	}

}
