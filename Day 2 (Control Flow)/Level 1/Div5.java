import java.util.Scanner;
public class Div5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }
}
