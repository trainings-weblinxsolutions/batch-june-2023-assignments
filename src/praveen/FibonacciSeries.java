package praveen;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci series up to " + n + ":");
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciGenerator.generateFibonacci(i) + " ");
        }
    }
}

class FibonacciGenerator {
    int generateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return generateFibonacci(n - 1) + generateFibonacci(n - 2);
    }
}