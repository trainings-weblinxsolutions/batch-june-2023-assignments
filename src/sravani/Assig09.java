package sravani;
public class Assig09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = -4, count = 0;

		if (num <= 1) {
			System.out.println("Given num is not a prime number");
			return;

		}

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}

		}

		if (count == 2) {
			System.out.println("Given num is a prime number");
		}

		else {
			System.out.println("Given num is not a prime number");
		}

	}

}
