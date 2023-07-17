package priyanka;
public class Even {

	public static void main(String[] args)
	{
		int num=100;
		System.out.print("Even numbers from 1 to" +num+":");
		for(int i=1; i<=num; i++) 
		{ //to check if the number is even or not 
			if(i%2==0) {
				System.out.print(i + "");
			}
		}
		

	}

}
