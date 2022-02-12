package Student;

import java.util.ArrayList;

public class App {
    private static final ArrayList<Student> studentArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Student student = new Student();
        student("YAS", student);
        student("SAY", student);
        student("AYS", student);
        student("ASY", student);

        for (Student s : studentArrayList) {
            System.out.printf("Student name %s | student scores %s  | student average score %.3f | student grade %.2f \n", s.getName(), s.getAllScores(), s.getStudentAverageScore(), s.getGrade());
        }
    }

    private static void student(String name, Student student) {
        student = new Student(name, student.getStudentScore(), student.getStudentAverageScore(), student.getStudentGrade());
        studentArrayList.add(student);
    }
}