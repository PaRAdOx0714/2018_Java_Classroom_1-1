package 종합실습과제;

import java.util.Scanner;

public class ans43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n: ");
		int n = sc.nextInt();
		int cnt=0;
		int nums[]=new int[n];
		System.out.println("[배열 요소]");
		for(int i=0;i<n;i++) {
			nums[i]=i+1;
			for(int j=2;j<nums[i];j++) {
				if(nums[i]%j==0) {
					nums[i]=0;
					break;
				}
			}
			if(nums[i]==1)
				nums[i]=0;
		}
		for(int i=0;i<n;i++) {
			System.out.printf("%2d ", nums[i]);
			if((i+1)%10==0 && i!=0)
				System.out.println();
		}
		sc.close();
			
		

	}

}
