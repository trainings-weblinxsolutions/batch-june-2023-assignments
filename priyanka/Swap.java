package swap;

public class Swap {

	public static void main(String[] args) {
		  int X = 10;
		  int Y = 15;
		  System.out.println("X value before swapping"+ X);
		  System.out.println("y value before swaping"+ Y);
		  
		  X= X^Y;
		  Y= X^Y;
		  X= X^Y;
		  
		  
		  System.out.println("value after swaping"+ X);
		  System.out.println("value after swaping "+ Y);
		  
		  }

}
 