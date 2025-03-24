import java.util.Scanner;
class Price{
	public static void main (String args []){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter unit Price: ");
	double UPrice = scan.nextDouble();
	System.out.println("Enter quantity: ");
	double quantity = scan.nextDouble();
	double Totalprice = quantity*UPrice;
	System.out.println(" The total purchace price is INR " + Totalprice + " if the quantity " + quantity + " and unit price is INR " + UPrice );
	}
}

