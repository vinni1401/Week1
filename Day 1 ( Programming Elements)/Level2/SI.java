import java.util.Scanner;
class SI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal, Rate and Time:");
		int P = scan.nextInt();
		int R = scan.nextInt();
		int T = scan.nextInt();
		int SI = (P*R*T)/100;
		System.out.println("The simple interest is " + SI + " for Principal " + P + " ,Rate " + R + " and Time " + T );
	}
}