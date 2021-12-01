import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        sc.close();

        for (int i = 1; i <=10; i++) {
            System.out.println("Factorial of " + i + " = " + getFactorial(i));
        }
    }
    private static long getFactorial(final int n) {
        int sum = 1;
        for(int i = 1; i <= n; i++)
        {
            sum *= i;
        }
        return sum;
    }
}