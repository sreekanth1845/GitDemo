package demoProject;

public class Leap {

	public static void main(String[] args) {

		int y = 1000;
		Boolean leap = false;

		if (y % 4 == 0) {
			if (y % 100 == 0) {
				if (y % 400 == 0)
					leap = true;
				else
					leap = false;
			}
			// if year not century
			else
				leap = true;
		} else
			leap = false;

		if (leap)
			System.out.println(y + " is a leap year");
		else
			System.out.println(y + " is not a leap year");

	}

}
