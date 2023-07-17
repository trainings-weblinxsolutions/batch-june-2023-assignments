package pooja;
public class PrimeNumber
{
	public static void main(String args[]) 
	{
		int num=13;
		boolean prime=false;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				 prime =true;
				break;
			
			}
		}
		if(!prime)

		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}
	


