import java.util.Scanner;

public class MaxOccurringCharSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = currentChar;
            }
        }

        System.out.println("Most frequent character: " + maxChar + " (occurs " + maxCount + " times)");
        sc.close();
    }
}
