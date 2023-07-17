package prudhvi;

public class Factorialofanumber {
    public static void main(String[] args) {

        int num = 4;
        int factorial = 1 ;
        int i = 1;
        while(i<=num)
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial = " + factorial);
}
}
