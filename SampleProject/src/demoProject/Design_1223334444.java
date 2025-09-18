package demoProject;

public class Design_1223334444 {

	public static void main(String[] args) {

		int rows = 4;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= j; k++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}