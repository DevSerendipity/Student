package Student;

import java.util.ArrayList;

public class App {
    private static final ArrayList<Student> studentArrayList = new ArrayList<>();

    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails();
        student("Q",studentDetails);
        student("W",studentDetails);
        student("E",studentDetails);
        student("R",studentDetails);

        for (Student s : studentArrayList) {
            System.out.printf("Student name %s | student scores %s  | student average score %.2f | student grade %.2f \n", s.getName(), s.getAllScores(), s.getStudentAverageScore(), s.getGrade());
        }
    }

    private static void student(String name, StudentDetails studentDetails) {
        Student student = new Student(name, studentDetails.getStudentScore(), studentDetails.studentAverageScore(), studentDetails.getStudentGrade());
        studentArrayList.add(student);
    }
}