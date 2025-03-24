import java.util.Scanner;
class Perimeterofsquare{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter perimeter :");
	float perimeter = scan.nextFloat();
	float length = perimeter/4;
	System.out.println("The length of the side is " + length + " whose perimeter is " + perimeter);
	}
}
