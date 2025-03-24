import java.util.Scanner;
class Park{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sides 1, 2 amd 3 :");
		int side1 = scan.nextInt();
		int side2 = scan.nextInt();
		int side3 = scan.nextInt();
		int distance = 5000;
		int perimeter = side1 + side2 + side3;
		int rounds = distance/perimeter;
		System.out.println("The total number of rounds the athelete will run is " + rounds + " to complete 5km " );
	}
}