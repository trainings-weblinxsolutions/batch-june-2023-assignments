class PrimeCheck
{
public static void main(String args[])
{
int num=27,m=0;
boolean result=true;      
m=num/2;      
if(num==0||num==1)
{  
System.out.println(num+" is not prime number");      
}
else
{  
for(int i=2;i<=m;i++)
{      
if(num%i==0)
{      
System.out.println(num+" is not prime number");      
result=false;      
break;      
}      
}      
if(result==true)  
{ 
System.out.println(num+" is prime number"); 
}  
}  
}    
}   