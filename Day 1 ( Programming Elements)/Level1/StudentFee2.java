import java.util.Scanner;
class StudentFee2{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter fee:");
	double fee = scan.nextDouble();
	System.out.println("Enter discountPercent:");
	double discountPercent	= scan.nextDouble();
	double discount = (fee*discountPercent)/100;
	double feetopay = fee-discount;
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + feetopay);
	}
}