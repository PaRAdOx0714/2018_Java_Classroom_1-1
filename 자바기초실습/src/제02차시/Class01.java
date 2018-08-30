package 제02차시;

public class Class01 {
	int i=0;
	
	Class01(){
		i+=3;
		System.out.println("Class01 : I'm a creater of Class01 class.");
		System.out.println("Class01 : I called just after you made an objecct shape of Class01.");
		System.out.println("i : I'm i, a.k.a field or member variable. Just know me as a public variable at C.");
		System.out.println("Current i : " + i);
		
		doIt();
		
	}
	
	void doIt() {
		i+=5;
		System.out.println("doIt() : I'm doIt() method, a.k.a member function.");
		System.out.println("doIt() : Call me whenever you need me. I'll be right there.");
		System.out.println("i : I'm i. How do you call my name? Oh, common. Field or member variable, 'i' said.");
		System.out.println("Current i : " + i);
	}

}