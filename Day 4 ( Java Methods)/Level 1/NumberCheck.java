import java.util.Scanner;

public class NumberCheck {
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Result: " + checkNumber(num));

        scanner.close();
    }
}
