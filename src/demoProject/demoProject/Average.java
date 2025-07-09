package demoProject;

public class Average {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 40, 50 };
		double sum = 0;

		for (int n : num) {
			sum = sum + n;
		}

		double avg = sum / num.length;

		System.out.println(avg);

	}

}
