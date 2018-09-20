package 종합실습과제;

import java.util.Scanner;

public class ans31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("암호문: ");
		String a = sc.nextLine();
		System.out.print("평문: ");
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=' ')
				System.out.print((char)(a.charAt(i)-3));
			else
				System.out.print(a.charAt(i));
		}
		sc.close();
			
	}

}
