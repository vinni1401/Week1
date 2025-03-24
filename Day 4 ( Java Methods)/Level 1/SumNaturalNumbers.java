import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumNatural(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Sum of first " + n + " natural numbers: " + sumNatural(n));

        scanner.close();
    }
}
