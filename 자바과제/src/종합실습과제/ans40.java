package 종합실습과제;

import java.util.Scanner;

public class ans40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int tmp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = tmp%5+1;
				tmp++;
			}
			tmp=i+1;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
