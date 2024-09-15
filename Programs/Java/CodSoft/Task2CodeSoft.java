package CodeSoft;

import java.util.Scanner;

public class Task2CodeSoft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize an array to store marks
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Take input for marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Enter marks for subject %d (out of 100): ", i + 1);
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine grade based on average percentage
        String grade = calculateGrade(averagePercentage);

        // Display results
        System.out.printf("\nTotal Marks: %d out of %d\n", totalMarks, numSubjects * 100);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.printf("Grade: %s\n", grade);

        scanner.close();
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
