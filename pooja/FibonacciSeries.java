package javaprograms;

public class FibonacciSeries 
{
  public static void main(String args[])
  {
	  int c=0, d=1, k;
	  System.out.print("Fibonacci Series:"+c + " "+d);
	  
	  for(int i=1; i<=10; i++)
	  {
		  k=c+d;
		  System.out.print(" "+k);
		  c=d;
		  d=k;
	  }
  }
}
