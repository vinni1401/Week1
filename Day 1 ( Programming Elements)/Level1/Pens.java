import java.util.Scanner;
class Pens{
	public static void main(String args[]){
	int pens = 14;
	int students = 3;
	int Quantityofpens = pens/students;
	int reminder = pens % students;
	System.out.println("The Pen Per Student is " + Quantityofpens + " and the remaining pen not distributed is " + reminder);
	}
}