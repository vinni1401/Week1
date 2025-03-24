import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int[] freq = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: " + maxChar);
        sc.close();
    }
}
