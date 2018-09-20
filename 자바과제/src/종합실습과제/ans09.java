package 종합실습과제;

import java.util.*;

public class ans09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int a;
		a = sc.nextInt();
		sc.nextLine();
		
		if(a<=6 || a>=70) {
			System.out.println("무료입장");
		}
		else
			System.out.println("유료입장");
		sc.close();

	}

}
