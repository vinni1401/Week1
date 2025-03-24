import java.util.Scanner;
class Height{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Height:");
	double Height = scan.nextDouble();
	double inch = Height/2.54;
	double foot = inch/12;
	System.out.println("Your height in cm is " + Height + " while in feet is " + foot + " and inches is " + inch);
	}
}