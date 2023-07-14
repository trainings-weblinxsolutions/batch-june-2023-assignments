  package fibonaccirecursion;

public class FibonacciusingRecursion {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int max = 20;
		Fibbonacci f1 = new Fibbonacci();
		for(int i=0; i<max; i++)
		{
		System.out.println(+f1.printFibbonacci(i));
		}
		}
		}

		class Fibbonacci
		{
		public int printFibbonacci(int count)
		{
		if(count==0)
		{
		return 0;
		}
		if(count==1 || count ==2)
		{
		return 1;
		}
		return (printFibbonacci(count-1) + printFibbonacci(count-2));
		
		
	}

}
