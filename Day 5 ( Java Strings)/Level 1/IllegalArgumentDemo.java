import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String str, int start, int end) {
        System.out.println(str.substring(end, start)); // Invalid start > end
    }

    public static void handleException(String str, int start, int end) {
        try {
            System.out.println(str.substring(end, start));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();

        generateException(str, 3, 1); // Uncomment to generate exception
        handleException(str, 3, 1);
    }
}
