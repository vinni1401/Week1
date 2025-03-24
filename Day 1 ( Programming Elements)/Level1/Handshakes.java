import java.util.Scanner;
class Handshakes{
	public static void main (String args []){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of students: ");
	double n = scan.nextDouble();
	double maxhand = (n*(n-1))/2;
	System.out.println("Maximum number of Handshakes is " + maxhand );
	}
}
