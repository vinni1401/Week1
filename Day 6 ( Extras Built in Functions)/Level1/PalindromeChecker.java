import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(str + (isPalindrome ? " is a Palindrome" : " is not a Palindrome"));
        sc.close();
    }

    public static boolean checkPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}
