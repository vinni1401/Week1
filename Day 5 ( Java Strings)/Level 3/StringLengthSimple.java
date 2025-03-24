import java.util.Scanner;

public class StringLengthSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
            System.out.println("Length of the string: " + length);
        }

        sc.close();
    }
}
