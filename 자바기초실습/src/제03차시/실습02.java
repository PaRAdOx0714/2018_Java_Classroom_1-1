package 제03차시;

public class 실습02 {
	public static void main(String[] args) {
		String a = "통신과";
		String b[] = {"Incheon","Electronic","Meister","Highschool"};
		
		String c[] = new String[4];
		c[0]="Incheon";
		c[1]="Electronic";
		c[2]="Meister";
		c[3]="Highschool";
		
		System.out.println(a.hashCode() + " : " + a);
		System.out.println(b.hashCode() + " : " + b[0] + " " + b[1] + " " + b[2] + " " + b[3]);
		System.out.println(c.hashCode() + " : " + c[0] + " " + c[1] + " " + c[2] + " " + c[3]);

	}

}
