package CodeSoft.Task5CodeSoft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {

    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            students = StudentDataManager.loadStudents();
        } catch (IOException e) {
            System.out.println("No previous data found. Starting fresh.");
        }

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    try {
                        StudentDataManager.saveStudents(students);
                    } catch (IOException e) {
                        System.out.println("Error saving data.");
                    }
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        if (name.isEmpty() || grade < 0) {
            System.out.println("Invalid input. Please try again.");
            return;
        }

        students.add(new Student(id, name, grade));
        System.out.println("Student added successfully.");
    }

    private static void editStudent() {
        System.out.print("Enter student ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new name (leave blank to keep current): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    student.setName(name);
                }

                System.out.print("Enter new grade (negative number to keep current): ");
                double grade = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                if (grade >= 0) {
                    student.setGrade(grade);
                }

                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

