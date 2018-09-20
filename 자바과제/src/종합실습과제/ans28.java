package 종합실습과제;

import java.util.Scanner;

public class ans28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("자연수 n: ");
		n = sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("판정결과: 합성수");
				break;
			}
			else {
				System.out.println("판정결과: 소수");
				break;
			}
				
		}
		sc.close();

	}

}
