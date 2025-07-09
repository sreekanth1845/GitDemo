package demoProject;

public class Swap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
