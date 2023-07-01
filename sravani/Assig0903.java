package assignments;

public class Assig0903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=9, num2=20;
		
		
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		
		System.out.print("The given two numbers after swapping is: ");
		System.out.println(num1+" "+num2);
		
		

	}

}
