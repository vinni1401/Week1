import java.util.Scanner;

public class CharArrayCompare {
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();

        char[] arr1 = getCharacters(str);
        char[] arr2 = str.toCharArray();

        System.out.println("Are they equal? " + java.util.Arrays.equals(arr1, arr2));
    }
}
