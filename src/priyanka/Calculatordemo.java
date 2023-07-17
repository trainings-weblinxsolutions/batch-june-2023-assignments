package priyanka;
public class Calculatordemo {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int x = 3, y = 1, z = 6;
		double p = 80.00, q = 12.00;
		int m = 40, n = 22;

		int printout1 = Multiply(x, y, z);
		System.out.println("Multiplication: " + printout1);

		int printout2 = Divide(p, q);
		System.out.println("Division: " + printout2);

		int printout3 = Subtract(m, n);
		System.out.println("Subtraction: " + printout3);

	}

	public static int Multiply(int x, int y, int z) {
		return x * y * z;
	}

	public static int Divide(double p, double q) {
		
		return   (int) (p/q);
	}

	public static int Subtract(int m, int n) {
		return m - n;
	}
}