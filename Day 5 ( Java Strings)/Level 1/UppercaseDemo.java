import java.util.Scanner;

public class UppercaseDemo {
    public static String toUppercaseUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String customUpper = toUppercaseUsingCharAt(str);
        String builtInUpper = str.toUpperCase();

        System.out.println("Are they equal? " + customUpper.equals(builtInUpper));
    }
}
