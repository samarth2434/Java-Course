import java.util.Scanner;

public class ques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;

        // Input marks for 5 subjects and calculate total marks
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            totalMarks += scanner.nextInt();
        }

        // Calculate percentage
        double percentage = (totalMarks / 500.0) * 100;

        // Output the percentage
        System.out.printf("Your percentage is: %.2f%%\n", percentage);

        scanner.close();
    }
}
