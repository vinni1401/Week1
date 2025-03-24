import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (1 or greater).");
            return;
        }
        int evenCount = number / 2;
        int oddCount = number - evenCount;

        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];

        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else {
                odds[oddIndex++] = i;
            }
        }
        System.out.print("Even numbers: ");
        for (int even : evens) {
            System.out.print(even + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int odd : odds) {
            System.out.print(odd + " ");
        }
        System.out.println();
    }
}
