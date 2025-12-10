public class Q06_Fibonacci {

    static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci (Iterative): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static void printFibonacciRecursive(int n) {
        System.out.print("Fibonacci (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8;
        fibonacciIterative(n);
        printFibonacciRecursive(n);
    }
}