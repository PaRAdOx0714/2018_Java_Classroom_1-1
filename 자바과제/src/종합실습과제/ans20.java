package 종합실습과제;

import java.util.Scanner;

public class ans20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 12자리: ");
		String a = sc.nextLine();
		char pn[]=a.toCharArray();
		int s=0;
		for(int i=0;i<=11;i++) {
			pn[i]-='0';
			s+=pn[i]*(i%8+2);
		}
		int t=s%11;
		System.out.println("13번째 수: " + (11-t)%10);

	}

}
