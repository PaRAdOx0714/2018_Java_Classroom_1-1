package 제03차시;

public class 실습04 {

	public static void main(String[] args) {
		
		//if,else
		System.out.println("<<if,else>>\n");
		int i=11;
		if(i%2==0)
			System.out.println(i + " is even.");
		else
			System.out.println(i + " is odd.");
		
		//switch
		System.out.println("\n<<switch>>\n");
		int n=7;
		switch(n) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println(n + "\'s last date is 31th."); break;
		
		case 2: System.out.println(n + "\'s last date is 28th."); break;
		default: System.out.println(n + "\'s last date is 30th."); break;
		}
		
		//for
		System.out.println("\n<<for>>\n");
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		
		//while
		System.out.println("\n<<while>>\n");
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
		}
		
		//do~while
		System.out.println("\n<<do~while>>\n");
		a=1;
		do {
			System.out.println(a);
			a++;
		}
		while(a<=10);

	}

}
