import java.util.Random;
import java.util.Scanner;

public class OTPGenerator {

    public static String generateOTP() {
        return String.format("%06d", new Random().nextInt(1000000));
    }

    public static boolean areOTPsUnique(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many OTPs to generate: ");
        int n = sc.nextInt();

        String[] otpArray = new String[n];
        for (int i = 0; i < n; i++) otpArray[i] = generateOTP();

        System.out.print("Generated OTPs: ");
        for (String otp : otpArray) System.out.print(otp + " ");
        System.out.println("\nAll OTPs Unique: " + areOTPsUnique(otpArray));
        sc.close();
    }
}
