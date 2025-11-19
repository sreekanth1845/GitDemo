package oops;

public class SubClass extends SuperClass {

	int b;

	public SubClass(int a, int b) {
		super(a);
		this.b = b;
	}

	public void demo() {
		System.out.println("SubClass:"+b);
		System.out.println("Addition:"+(a + b));
	}
}
