public class FactMethod {

    // Factorial method for integers
    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    // Factorial method for long integers
    public static long factorial(long n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num1 = 5;
        long num2 = 6;

        System.out.println("Factorial of " + num1 + " is: " + factorial(num1));
        System.out.println("Factorial of " + num2 + " is: " + factorial(num2));
    }
}
