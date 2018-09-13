package 종합실습과제;

public class ans19 {

	public static void main(String[] args) {
		int d=-1;
		int tmp=0;
		for(int i=1;i<=10;i++) {
			d*=-1;
			tmp += i*d;
			if((i*d)>1)
				System.out.print("+");
			System.out.print(i*d);
			
			
		}
		System.out.print("= " + tmp);
	}

}
