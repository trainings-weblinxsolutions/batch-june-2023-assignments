package Boolean;

public class Bitwise {

	public static void main(String[] args) {
		// Bitwise operators
		int a=0;
		int b=1;
	
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		//Relational
		int m=15;
		int n=10;
		System.out.println(m==n); 
		System.out.println(m !=n);
		System.out.println(m>n);
		System.out.println(m<n);
		System.out.println(m>=n);
		System.out.println(m<=n);
		//Boolean operators 
		boolean X= true;
		boolean Y= false;
		System.out.println("X|Y=" +(X|Y));
		System.out.println("!X=" +(!X)); 
		System.out.println("X&Y=" +(X&Y));
		System.out.println("X^Y=" +(X^Y));
		System.out.println("(X|Y)&X=" +((X|Y)&X));
		//Number to Binary
		int num= 18;
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);

		
}}
