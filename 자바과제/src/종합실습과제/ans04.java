package 종합실습과제;

import java.util.Scanner;

public class ans04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.print("소문자: ");
		a = sc.nextLine();
		
		System.out.println("대문자: " + a.toUpperCase());
		sc.close();

	}

}
