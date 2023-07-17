package prudhvi;

class FibbonaciRecursion
{
    public static void main(String args[])
    {
        int maxnum= 2;
        Fibbo f1 = new Fibbo();
        for(int i=0; i<maxnum; i++)
        {
            System.out.print(+f1.Fibbo(i)+",");
        }
    }
}

class Fibbo
{
    public int Fibbo(int count)
    {
        if(count==0)
        {
            return 0;
        }
        if(count==1 || count ==2)
        {
            return 1;
        }
        return (Fibbo(count-1) + Fibbo(count-2));
    }
}
