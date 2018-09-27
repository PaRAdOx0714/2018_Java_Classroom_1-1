package 종합실습과제;

import java.util.Scanner;

public class ans48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수: ");
		int su = sc.nextInt();
		System.out.println("변환할 진수: ");
		int k = sc.nextInt();
		sc.close();
		int carry=0;
		//0 1 2 3 4 5 6 7 8 9 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z - 36진수
		while(su%k<k) {
			if(su/k > 0)
				carry = su/k;
		}


	}

}
