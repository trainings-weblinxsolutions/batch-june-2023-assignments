public class SwappingNumbers
{
    public static void main(String args[])
    {
        int x=10,y=20;
        System.out.println("Before Swapping");
        System.out.println("x = " +x +", y = " +y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swapping");
        System.out.print("x = " +x +", y = " +y);
    }
}