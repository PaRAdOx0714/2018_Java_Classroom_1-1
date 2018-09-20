package 종합실습과제;

import java.util.Scanner;

public class ans32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수: ");
		String a = sc.nextLine();
		a.toCharArray();
		int sum=0;
		for(int i=0;i<a.length();i++) {
			sum+=(a.charAt(i)-48);
		}
		System.out.println("결과: " + sum);
		sc.close();
	}

}
