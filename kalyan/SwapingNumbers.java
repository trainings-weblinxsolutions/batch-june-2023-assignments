class SwapingNumbers  
{  
public static void main(String args[])  
{  
int x=10,y=20;   
System.out.println("Before swapping:");  
System.out.println("x = " +x +", y = " +y);  
x = x ^ y;  
y = x ^ y;  
x = x ^ y;  
System.out.println("After swapping:");  
System.out.print("x = " +x +", y = " +y);  
}  
}  