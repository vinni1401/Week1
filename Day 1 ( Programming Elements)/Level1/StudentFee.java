import java.util.Scanner;
class StudentFee{
	public static void main(String args[]){
	int fee = 125000;
	int discountPercent = 10;
	int discount = (fee*discountPercent)/100;
	int feetopay = fee-discount;
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + feetopay);
	}
}