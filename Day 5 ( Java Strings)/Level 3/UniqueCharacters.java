import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        StringBuilder uniqueChars = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (uniqueChars.indexOf(String.valueOf(c)) == -1) {
                uniqueChars.append(c);
            }
        }

        System.out.println("Unique characters: " + uniqueChars);
        sc.close();
    }
}
