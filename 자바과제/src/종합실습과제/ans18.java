package 종합실습과제;

import java.util.Scanner;

public class ans18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 글자: ");
		String a = sc.next();
		char b = a.charAt(0);
		int z = 'Z';
		for(char i=b;i<=z;i++)
			System.out.print(i+" ");
		

	}

}
