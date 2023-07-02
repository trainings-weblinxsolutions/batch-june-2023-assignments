package javaprograms;

public class Swap 
{
    public static void main(String args[])
    {
    	int a = 25;
    	int b = 10;
    	
    	a= a+b;
    	b=a-b;
    	a=a-b;
    	System.out.println("After swapping two numbers:"+ a+" "+ b);
    }
}
