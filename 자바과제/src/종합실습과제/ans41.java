package 종합실습과제;

import java.util.Scanner;

public class ans41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n = sc.nextInt();
		int arr[][] = new int[n][n*2-1];
		for(int i=0;i<n;i++) 
			for(int j=n-1-i;j<n+i;j++) 
				arr[i][j] = '*';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n+i;j++) {
				System.out.print((char)arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
			

	}

}
