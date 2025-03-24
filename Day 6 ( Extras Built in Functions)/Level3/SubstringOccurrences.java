import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter the substring: ");
        String subStr = sc.nextLine();
        
        int count = 0;
        int index = 0;
        
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        System.out.println("Occurrences: " + count);
        sc.close();
    }
}
