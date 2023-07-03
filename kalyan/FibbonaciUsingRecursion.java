class FibbonaciUsingRecursion
{
public static void main(String args[])
{
int maxnum = 10;
Fibbo f1 = new Fibbo();
for(int i=0; i<maxnum; i++)
{
System.out.println(+f1.printFibbo(i));
}
}
}

class Fibbo
{
public int printFibbo(int count)
{
if(count==0)
{
return 0;
}
if(count==1 || count ==2)
{
return 1;
}
return (printFibbo(count-1) + printFibbo(count-2));
}
}
