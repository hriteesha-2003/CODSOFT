import java.util.Scanner;

public class Main1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of subjects you want to calculate: ");
        int numSub = scan.nextInt();

        
        if (numSub <= 0) {
            System.out.println("Please enter a valid number of subjects.");
            scan.close();
            return;
        }

        int totalMarks = 0;
        double averagePercentage;

        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scan.nextInt();

            // Validate marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                scan.close();
                return;
            }

            totalMarks += marks;
        }

        averagePercentage = (double) totalMarks / numSub;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scan.close();
    }
}
