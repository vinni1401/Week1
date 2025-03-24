import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String str) {
        System.out.println(Integer.parseInt(str)); 
    }

    public static void handleException(String str) {
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();

        // generateException(str); // Uncomment to generate exception
        handleException(str);
    }
}
