package 종합실습과제;

public class ans23 {

	public static void main(String[] args) {
		int cnt3=0;
		int cnt5=0;
		int cnt15=0;
		int tmp=0;
		int tmp15=0;
		for(int i=3;i<=1000;i+=3) {
			if(i%5!=0) {
				cnt3++;
				tmp+=i;
			}
		}
		for(int i=5;i<=1000;i+=5) {
			if(i%3!=0) {
				cnt5++;
				tmp+=i;
			}
		}
		for(int i=15;i<=1000;i+=15) {
			cnt15++;
			tmp15+=i;
		}
		System.out.println("갯수: " + (cnt3+cnt5+cnt15));
		System.out.println("합계: " + (tmp + tmp15));

	}

}
