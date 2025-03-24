import java.util.Scanner;

public class NumberChecker2 {

    public static int sumOfDigits(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    public static int sumOfSquares(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit;
            temp /= 10;
        }
        return sum;
    }

    public static boolean isHarshad(int num) {
        return num % sumOfDigits(num) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Harshad Number: " + isHarshad(num));
        System.out.println("Sum of Digits: " + sumOfDigits(num));
        System.out.println("Sum of Squares: " + sumOfSquares(num));
        sc.close();
    }
}
