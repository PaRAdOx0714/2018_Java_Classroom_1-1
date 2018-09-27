package 종합실습과제;

import java.util.Scanner;

public class ans36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수: ");
		int i = sc.nextInt();
		System.out.print("결과:");
		for(int j = 2;j<=i;j++) {
			if(i%j == 0) 
				System.out.print(" " + j);
			j=2;
			i=i/j;
		}
		sc.close();

	}

}
