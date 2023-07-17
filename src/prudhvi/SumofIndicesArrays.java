package prudhvi;

public class SumofIndicesArrays
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
        System.out.println("Sum at even indices = " + even);
        System.out.println("Sum at odd indices = " + odd);
        if(even>odd)
        {
            System.out.println("Sum of even indices are greater");
        }
        else
        {
            System.out.println("Sum at odd indices is greatest.");
        }
    }
}