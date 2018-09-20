package 종합실습과제;

import java.util.Scanner;

public class ans34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수: ");
		int a = sc.nextInt();
		System.out.print("수열: ");
		int tmp=1;
		for(int i=0;i<a;i++) {
			tmp+=i;
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println(a + "번째 수: " + tmp);
		

	}

}
