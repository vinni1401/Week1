import java.util.Scanner;

public class LowercaseDemo {
    public static String toLowercaseUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String customLower = toLowercaseUsingCharAt(str);
        String builtInLower = str.toLowerCase();

        System.out.println("Are they equal? " + customLower.equals(builtInLower));
    }
}
