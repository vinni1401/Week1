import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int ageA = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightA = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageB = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightB = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageC = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightC = sc.nextInt();
        if (ageA < ageB && ageA < ageC) {
            System.out.println("Youngest friend is Amar");
        } else if (ageB < ageA && ageB < ageC) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }
        if (heightA > heightB && heightA > heightC) {
            System.out.println("Tallest friend is Amar");
        } else if (heightB > heightA && heightB > heightC) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }
    }
}
