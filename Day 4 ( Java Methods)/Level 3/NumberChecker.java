import java.util.Scanner;

public class NumberChecker {
    public static int countDigits(int num) {
        int count = 0, temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num) {
        int size = countDigits(num);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        while (num > 0) {
            if (num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, power = countDigits(num);
        int[] digits = storeDigits(num);
        for (int d : digits) sum += Math.pow(d, power);
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Duck Number: " + isDuckNumber(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));
        sc.close();
    }
}
