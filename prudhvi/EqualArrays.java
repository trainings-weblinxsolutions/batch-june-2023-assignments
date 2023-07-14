public class EqualArrays
{
    public static void main(String[] args)
    {
        int arr1[] = {2,3,4,5};
        int arr2[] = {2,3,4,5};
        boolean result = true;
        if (arr1.length==arr2.length)
        {
            for (int i = 0; i < arr1.length; i++)
            {
                if (arr1[i]!=arr2[i])
                {
                    result = false;
                }
                else
                {
                    result=true;
                }
            }
        }
        else
        {
            result = false;
        }
        if (result == true)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}
class NotEqualArrays
{
    public static void main(String[] args)
    {
        int arr1[] = {2,3,4,5};
        int arr2[] = {2,3,4,6};
        boolean result = true;
        if (arr1.length==arr2.length)
        {
            for (int i = 0; i < arr1.length; i++)
            {
                if (arr1[i]!=arr2[i])
                {
                    result = false;
                }
                else
                {
                    result=true;
                }
            }
        }
        else
        {
            result = false;
        }
        if (result == true)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}