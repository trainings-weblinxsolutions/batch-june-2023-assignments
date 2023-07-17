package sravani;
public class Assig0902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 1;
		int n = 10;
		
		System.out.print("The fibonacci series is: ");
		System.out.print(num1+" "+num2);


		for (int i = 2; i <= n; i++) {
			
				int num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
				
				System.out.print(" "+num3);

			}
//			
//			System.out.print(" The fibonacci series is " + num1 + " "+num2);
//
//			System.out.print(num2);

		}

	}


