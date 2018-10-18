package _03_객체지향_언어의_특징_다형성;

public class Test1 {
	void print(int arg0, int arg1) {
		System.out.println(arg0 + arg1);
	}
	
	void print(String arg0, int arg1) {
		System.out.println(arg0 + arg1);
	}

	void print(int arg0, String arg1) {
		System.out.println(arg0 + arg1);
	}
	
	void print(String arg0 , String arg1) {
		System.out.println(arg0 + arg1);
	}
	
	void bark() {
		System.out.println("wouf wouf");
	}
}
