public class Q05_Factorial {

    static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static long factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " (Iterative): " + factorialIterative(num));
        System.out.println("Factorial of " + num + " (Recursive): " + factorialRecursive(num));
    }
}