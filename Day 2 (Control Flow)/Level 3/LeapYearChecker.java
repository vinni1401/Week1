import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } 
					else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } 
				else {
                    System.out.println(year + " is a Leap Year.");
                }
            } 
			else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } 
		else {
            System.out.println("Year must be greater than or equal to 1582.");
        }
    }
}
