package 종합실습과제;

import java.util.Scanner;

public class ans44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int tmp=1;
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		for(int i=0;i<n;i++) 
			for(int j=0;j<=i;j++,tmp++) 
				arr[i-j][j]=tmp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++)
				System.out.printf("%2d ", arr[i][j]);
			System.out.println();
		}
		sc.close();
		
	}

}
