package oopProject;

public class getterSetter {

	private String name;
	private int age;
	private String country;

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		getterSetter gs = new getterSetter();

		gs.setName("Srikanth");
		gs.setAge(28);
		gs.setCountry("India");

		// Print values
		System.out.println(gs.getName());
		System.out.println(gs.getAge());
		System.out.println(gs.getCountry());

	}
}
