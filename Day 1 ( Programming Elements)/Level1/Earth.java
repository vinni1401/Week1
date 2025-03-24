import java.util.Scanner;
class Earth{
	public static void main(String[] args){
		int radius = 6387;
		double pi = 3.14;
		double Volume = (4/3)*pi*Math.pow(radius,3);
		double miles = Volume*0.24;
		System.out.println("The Volume of earth in cubic kilometers is " +Volume + " and the cubic miles is " + miles);
	}
}
