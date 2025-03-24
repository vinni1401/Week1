import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100, guess;
        String response;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        while (true) {
            guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            response = sc.next();

            if (response.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it right.");
                break;
            } else if (response.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (response.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
        sc.close();
    }
}
