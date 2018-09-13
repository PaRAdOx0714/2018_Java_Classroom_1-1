package 종합실습과제;

import java.util.*;

public class ans13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.print("직원코드: ");
		String a = sc.nextLine();
		if(a.charAt(3)==1)
			System.out.println("부서: 총무부");
		else if(a.charAt(3)==2)
			System.out.println("부서: 인사부");
		else
			System.out.println("부서: 영업부");

	}

}
