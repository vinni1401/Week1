import java.util.Scanner;
public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        System.out.println("Multiples of " + number + " below 100 are:");
        int counter = 1;
        while (counter < 100) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
