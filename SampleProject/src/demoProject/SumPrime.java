package demoProject;

import java.math.BigInteger;

public class SumPrime {

	public static void main(String[] args) {
		
		prime(13);

		int num1 = 1;
		int num2 = 100;
		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			int n = i;
			int count = 0;

			for (int a = 2; a <= (n / 2); a++) {
				if ((n % a) == 0) {
					count++;
				}
			}
			
			if (count == 0 && i != 1) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
		
		
	}

	private static void prime(int num) {
	
		
	}
}