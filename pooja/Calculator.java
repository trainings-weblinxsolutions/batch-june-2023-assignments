package javaprograms;

public class Calculator 
{

  public int multiply(int num1, int num2,int num3)
  {
	  return num1*num2*num3;
  }
  public int divide(double a, double b)
  {
	  return (int) (a/b);
  }
  public int subtract(int c, int d)
  {
	  return c-d;
  }
 public static void main(String args[]) 
 {

    Calculator cal = new Calculator();
    System.out.println("Multiplying three mbers : "+ (cal.multiply(5,4, 8)));
    System.out.println("Dividing two numbers : "+ (cal.divide(25.0,5.0)));
    System.out.println("Subtracting two numbers : "+ (cal.subtract(19, 8)));
}
}
