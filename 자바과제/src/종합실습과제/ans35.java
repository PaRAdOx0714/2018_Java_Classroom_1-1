package 종합실습과제;

import java.util.Scanner;

public class ans35 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("자연수: ");
		int i = sc.nextInt();
		int arr[] = new int[i];
		System.out.print("수열: 1 1");
		int j;
		for(j=2;j<i;j++) {
			arr[0]=1;
			arr[1]=1;
			arr[j]=arr[j-1]+arr[j-2];
			System.out.print(" " + arr[j]);
		}
		System.out.println();
		System.out.println("10번째 수: " + arr[i-1]);
		sc.close();

	}

}
