import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int tableNumber = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
        }
    }
}
