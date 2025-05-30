import java.util.Scanner;

public class Main {
    public static int oddlyEvenDifference(String number) {
        int oddSum = 0, evenSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0'; // Convert char to integer
            
            if ((i + 1) % 2 == 0) { // Even position (1-based index)
                evenSum += digit;
            } else { // Odd position (1-based index)
                oddSum += digit;
            }
        }
        return Math.abs(oddSum - evenSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next(); // Read number as string to handle large inputs
        scanner.close();
        System.out.println(oddlyEvenDifference(number));
    }
}
