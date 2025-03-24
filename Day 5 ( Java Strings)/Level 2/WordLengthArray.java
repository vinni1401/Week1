import java.util.Scanner;

public class WordLengthArray {
    public static String[][] getWordsWithLength(String text) {
        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        String[][] wordLengths = getWordsWithLength(input);

        System.out.println("Word\tLength");
        for (String[] word : wordLengths) {
            System.out.println(word[0] + "\t" + word[1]);
        }
    }
}
