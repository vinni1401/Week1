import java.util.Scanner;
class Areaoftriangle{
	public static void main(String[] args){ 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter base:");
	double base = scan.nextDouble();
	System.out.println("Enter height:");
	double height = scan.nextDouble();
	double Area = 1/2f*base*height;
	double inch = Area*0.155;
	System.out.println("Your area in square cm is " + Area + " and in saqure inches is " + inch);
	}
}
