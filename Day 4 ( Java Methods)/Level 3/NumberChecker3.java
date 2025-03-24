import java.util.Scanner;

public class NumberChecker3 {

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Palindrome: " + isPalindrome(num));
        sc.close();
    }
}
