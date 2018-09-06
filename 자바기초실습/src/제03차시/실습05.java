package 제03차시;

public class 실습05 {

	public static void main(String[] args) {
		int a[];
		a= new int[5];
		for(int i=0;i<=4;i++) {
			int j=10;
			a[i]=j;
			j+=5;
		}
		
		int b[][]= {
				{1,2,3,4,5},
				{6,7,8,9},
				{10,11,12},
				{13,14},
				{15}
		};
		
		System.out.println("배열 a[]의 크기: " + a.length);
		System.out.println("배열 b[][]의 크기: " + b.length);
		System.out.println("배열 b[1]의 크기: " + b[1].length);
		System.out.println("배열 b[4]의 크기: " + b[4].length);
	}

}
