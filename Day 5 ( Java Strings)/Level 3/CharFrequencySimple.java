import java.util.Scanner;

public class CharFrequencySimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        boolean[] counted = new boolean[text.length()];

        System.out.println("Character Frequency:");
        for (int i = 0; i < text.length(); i++) {
            if (counted[i]) continue;
            char currentChar = text.charAt(i);
            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(currentChar + " - " + count);
        }

        sc.close();
    }
}
