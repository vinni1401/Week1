import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        int oNumber = number; 
        int sum = 0;
        while (oNumber != 0) {
            int digit = oNumber % 10; 
            sum += digit * digit * digit;
            oNumber /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }
}