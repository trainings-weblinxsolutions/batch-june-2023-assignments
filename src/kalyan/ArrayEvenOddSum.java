package kalyan;

class ArrayEvenOddSum 
{
public static void main(String args[])
{
int arr[] = {4,5,2,8,3,6};
int even=0,odd=0;
for (int i = 0; i < arr.length; i++) 
{
if (i % 2 == 0)
even=even+arr[i];
else
odd=odd+arr[i];
}
System.out.println("Even index positions sum: " + even);
System.out.println("Odd index positions sum: " + odd);
if(even>odd)
{
System.out.println("Sum of even indices are greater");
}
else
{
System.out.println("sum of odd indicies are greater");
}
}
}