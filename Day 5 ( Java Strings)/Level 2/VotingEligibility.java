import java.util.Scanner;

public class VotingEligibility {
    public static void checkVotingEligibility(int[] ages) {
        System.out.println("Age\tCan Vote?");
        for (int age : ages) {
            System.out.println(age + "\t" + (age >= 18));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = scanner.nextInt();
        }
        scanner.close();

        checkVotingEligibility(ages);
    }
}
