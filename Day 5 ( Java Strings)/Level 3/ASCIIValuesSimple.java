import java.util.Scanner;

public class ASCIIValuesSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Character ASCII Values:");
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + " - " + (int) text.charAt(i));
        }

        sc.close();
    }
}
