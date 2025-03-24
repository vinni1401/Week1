import java.util.Scanner;

public class TrimString {
    public static String trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String trimmed = trimSpaces(input);
        System.out.println("Trimmed text: \"" + trimmed + "\"");
    }
}
