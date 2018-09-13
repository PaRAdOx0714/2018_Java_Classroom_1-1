package 종합실습과제;

import java.util.Scanner;

public class ans22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n = sc.nextInt();
		System.out.println("약수 :");
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				cnt++;}
		}
		System.out.println();
		System.out.println("약수의 개수: " + cnt);

	}

}
