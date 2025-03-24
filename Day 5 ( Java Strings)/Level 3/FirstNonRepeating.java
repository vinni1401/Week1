import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        for (char c : text.toCharArray()) {
            if (text.indexOf(c) == text.lastIndexOf(c)) {
                System.out.println("First non-repeating character: " + c);
                sc.close();
                return;
            }
        }

        System.out.println("No unique character found.");
        sc.close();
    }
}
