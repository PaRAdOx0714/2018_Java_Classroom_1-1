package 종합실습과제;

import java.util.*;

public class ans10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("주민등록번호: " + a);
		if(a.charAt(7)==4)
			System.out.println("성별: 여자");
		else
			System.out.println("성별: 남자");

	}

}
