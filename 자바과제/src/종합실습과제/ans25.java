package 종합실습과제;

import java.util.Scanner;

public class ans25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수n: ");
		int n = sc.nextInt();
		int tmp=0;
		for(int i=1;i<=n;i++) {
			tmp+=i;
			System.out.print(tmp + " ");
		}
		sc.close();
	}

}
