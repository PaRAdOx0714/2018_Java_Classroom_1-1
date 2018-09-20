package 종합실습과제;

import java.util.*;

public class ans12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,av;
		sc.useDelimiter("\r|\n|,");
		System.out.print("두 과목 점수: ");
		a = sc.nextInt();
		b= sc.nextInt();
		av = (a+b)/2;
		
		
		if(av>=60 && a>=40 && b>=40)
			System.out.println("결과: 합격");
		else if(av>=60 && (a<40 || b<40))
			System.out.println("결과: 불합격(과락)");
		else
			System.out.println("결과: 불합격");
		sc.close();
	}

}
