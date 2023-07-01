package assignments;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, y = 3, z = 4;
		double a = 38.00, b = 19.00;
		int p = 34, q = 23;

		int output1 = Multiply(x, y, z);
		System.out.println("Multiplication: " + output1);

		int output2 = Divide(a, b);
		System.out.println("Division: " + output2);

		int output3 = Subtract(p, q);
		System.out.println("Subtraction: " + output3);

	}

	public static int Multiply(int x, int y, int z) {
		return x * y * z;
	}

	public static int Divide(double a, double b) {
		
		return (int) (a / b);
	}

	public static int Subtract(int p, int q) {
		return p - q;
	}
}
