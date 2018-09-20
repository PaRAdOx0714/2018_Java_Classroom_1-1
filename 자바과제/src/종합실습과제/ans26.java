package 종합실습과제;

import java.util.Scanner;

public class ans26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n = sc.nextInt();
		int tmp=0;
		int tmp1=1;
		System.out.print("수열: ");
		for(int i=1;i<=n;i++) {
			tmp1*=i;
			tmp+=tmp1;
			System.out.print(tmp1 + " ");
		}
		System.out.println();
		System.out.println("수열의 합: " + tmp);
		sc.close();

	}

}
