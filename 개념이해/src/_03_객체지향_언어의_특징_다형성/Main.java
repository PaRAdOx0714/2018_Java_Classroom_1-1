package _03_객체지향_언어의_특징_다형성;

public class Main {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.print(1,1);
		t.print(1, "1");
		t.print("1", 1);
		t.print("1", "1");
		t.bark();
		Test2 a = new Test2();
		a.bark();
		
	}

}