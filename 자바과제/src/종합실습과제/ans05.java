package 종합실습과제;

import java.util.Scanner;

public class ans05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("시간(초): ");
		a = sc.nextInt();
		int h,m,s;
		h = a/3600;
		m = (a%3600)/60;
		s = (a%3600)%60;
		
		System.out.printf("%02d시간%02d분%02d초", h, m, s);

	}

}
