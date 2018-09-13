package 종합실습과제;

import java.util.Scanner;

public class ans03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("섭씨온도(C): ");
		a = sc.nextInt();
		
		System.out.printf("화씨온도(F): %.2f도", ((float)a*1.8)+32);
		

	}

}
