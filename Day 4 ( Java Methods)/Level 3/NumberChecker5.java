import java.util.Scanner;

public class NumberChecker5 {

    public static int[] factors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        
        int[] factorArray = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factorArray[index++] = i;

        return factorArray;
    }

    public static int greatestFactor(int num) {
        int[] factors = factors(num);
        return factors[factors.length - 2]; 
    }

    public static int sumOfFactors(int num) {
        int sum = 0;
        for (int f : factors(num)) sum += f;
        return sum;
    }

    public static int productOfFactors(int num) {
        int product = 1;
        for (int f : factors(num)) product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int num) {
        double product = 1;
        for (int f : factors(num)) product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfect(int num) {
        return sumOfFactors(num) - num == num;
    }

    public static boolean isAbundant(int num) {
        return sumOfFactors(num) - num > num;
    }

    public static boolean isDeficient(int num) {
        return sumOfFactors(num) - num < num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factorArray = factors(num);
        System.out.print("Factors: ");
        for (int f : factorArray) System.out.print(f + " ");
        System.out.println("\nGreatest Factor: " + greatestFactor(num));
        System.out.println("Sum of Factors: " + sumOfFactors(num));
        System.out.println("Product of Factors: " + productOfFactors(num));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(num));
        System.out.println("Perfect Number: " + isPerfect(num));
        System.out.println("Abundant Number: " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));
        System.out.println("Strong Number: " + isStrong(num));

        sc.close();
    }
}
