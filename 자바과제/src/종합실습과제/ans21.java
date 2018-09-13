package 종합실습과제;

import java.util.Scanner;

public class ans21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int a = sc.nextInt();
		int tmp=0;
		for(int i=1;i<=a;i++)
			tmp+=(int)Math.pow(i, 2);
		System.out.println("결과: " + tmp);
	}

}
