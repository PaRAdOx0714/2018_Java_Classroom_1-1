package 종합실습과제;

public class ans24 {

	public static void main(String[] args) {
		System.out.println("[ASCII 코드표]");
		for(int i=32;i<=127;i++) {
			System.out.printf("%3d %c  ", i, (char)i);
			if((i%10)==1)
				System.out.println();
		}

	}

}
