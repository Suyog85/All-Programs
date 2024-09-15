package CodeSoft.Task5CodeSoft;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataManager {

    private static final String FILE_PATH = "students.txt";

    public static void saveStudents(List<Student> students) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getGrade());
                writer.newLine();
            }
        }
    }

    public static List<Student> loadStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double grade = Double.parseDouble(parts[2]);
                    students.add(new Student(id, name, grade));
                }
            }
        }
        return students;
    }
}

