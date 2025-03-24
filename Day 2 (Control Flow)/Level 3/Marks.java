import java.util.Scanner;
public class Marks{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = scan.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scan.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = scan.nextInt();
        double average = (physics + chemistry + maths)/3;
        System.out.printf("Average Percentage: ", average);
        if (average >= 80) {
            System.out.println("Grade: A\nRemarks: Level 4, above agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Grade: B\nRemarks: Level 3, at agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Grade: C\nRemarks: Level 2, below, but approaching agency-normalized standards");
        } else if (average >= 50) {
            System.out.println("Grade: D\nRemarks: Level 1, well below agency-normalized standards");
        } else if (average >= 40) {
            System.out.println("Grade: E\nRemarks: Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Grade: R\nRemarks: Remedial standards");
        }
    }
}
