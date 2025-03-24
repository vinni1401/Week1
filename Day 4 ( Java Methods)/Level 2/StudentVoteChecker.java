import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.println(canVote(age) ? "Can vote" : "Cannot vote");
        }
    }
}
