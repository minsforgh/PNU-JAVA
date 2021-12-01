import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a begin number: ");
        int begin = sc.nextInt();
        System.out.print("Enter an end number: ");
        int end = sc.nextInt();
        sc.close();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }

    private static int getSumBetween(int x, int y) {
        int sum = 0;
        for(int i = x; i <= y; i++)
            sum+= i;

        return sum;
    }

    private static int getProductBetween(int x, int y) {
        int Product = 1;
        for(int i = x; i <= y; i++)
            Product*= i;

        return Product;
    }
}