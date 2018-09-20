package 종합실습과제;

import java.util.Scanner;

public class ans15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("프로 점수: ");
		int a = sc.nextInt();
		int b = a/10;
		System.out.print("등급: ");
		switch(b) {
		case 10:
		case 9: {
			System.out.print("A");
			break;
		}
		case 8: {
			System.out.print("B");
			break;
		}
		case 7: {
			System.out.print("C");
			break;
		}
		case 6: {
			System.out.print("D");
			break;
		}
		default: System.out.print("E");
		}
		sc.close();

	}

}
