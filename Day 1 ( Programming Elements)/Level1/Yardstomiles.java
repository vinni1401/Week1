import java.util.Scanner;
class Yardstomiles{
	public static void main (String args []){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Distance in feet: ");
	double Distance = scan.nextDouble();
	double Distanceyards = Distance/3;
	double Distancemiles = Distanceyards/1760;
	System.out.println("Your Distance in feet is " + Distance + " and in yards is " + Distanceyards + " and in miles is " + Distancemiles );
	}
}

	