class CalculatorDemo
{
    public static void main(String args[])
    {
        Calculator c1 = new Calculator();
        System.out.println("Multiplication = " +c1.mul(1,2,3));
        System.out.println("Division = " +c1.div(1,2));
        System.out.println("Substraction = " +c1.sub(1,2));

    }
}


class Calculator
{
    public int mul(int a, int b, int c)
    {
        return (a*b*c);
    }
    public int div (int a, int b)
    {
        return (int)(a/b);
    }
    public int sub(int a, int b)
    {
        return (a-b);
    }
}