package 종합실습과제;

import java.util.*;

public class ans08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("정수: ");
		a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("절댓값: " + (a<0?(a*-1):a));
		sc.close();
		

	}

}
