package sravani;
public class Assig0802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {4, 5, 2, 8, 3, 6};
		int evenSum = 0, oddSum=0;
		
		for (int i= 0; i<array.length; i++) {
			
			if(i%2 == 0) {
				evenSum = evenSum+array[i];
				
			}
			else 
				oddSum = oddSum+array[i];
		}

		System.out.println("The sum at even indices is: " +evenSum);
		
		System.out.println("The sum at odd indices is: " +oddSum);


		if(evenSum>oddSum) {
			System.out.println("The sum at even indices is greater than sum at odd indices ");
		}
		
		else
			System.out.println("The sum at odd indices is greater than sum at even indices ");

	}

}
