package Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teacher extends Student {
    private final ArrayList<Student> studentArrayList = new ArrayList<>();
    private final Map<String, Integer> studentScore = new HashMap<>();
    private final App app = new App();
    private final Student student = new Student();

    void studentDetails() {
        StudentDetails studentDetails = new StudentDetails();
        student(student.getName(), studentDetails, student);
        student("R", studentDetails, student);
        showCurrentStudents();
    }

    private void student(String name, StudentDetails studentDetails, Student studentMan) {
        Student student = new Student(name, studentMan.getAllScores(), studentDetails.studentAverageScore(), studentDetails.getStudentGrade());
        studentArrayList.add(student);
    }

    private void showCurrentStudents() {
        for (Student s : studentArrayList) {
            System.out.printf("Student name %s | student scores %s  | student average score %.2f | student grade %.2f \n", s.getName(), s.getAllScores(), s.getStudentAverageScore(), s.getGrade());
        }
    }

    void generateRateStudentInformation() {
        student.setName("NAME");
        StudentDetails studentDetails = new StudentDetails();
        student.setScores(studentDetails.getStudentScore());
    }

    void updateStudentInformation() {
        System.out.print("Set new student name: ");
        String name = app.getInput().next();
        studentArrayList.get(0).setName(name);
    }

    void deleteStudent() {
        studentArrayList.remove(0);
        showCurrentStudents();
    }

    void addStudentInformation() {
        System.out.print("Enter student name: ");
        String name = app.getInput().next();
        for (int i = 0; i < 5; i++) {
            setStudentScore(i);
        }
        setStudentData(name);
    }

    private void setStudentScore(int i) {
        System.out.print("Enter details for test number " + i + "\nEnter student test name: ");
        String testName = app.getInput().next();
        System.out.print("Enter student test score for test: ");
        int testScore = app.getInput().nextInt();
        studentScore.putIfAbsent(testName, testScore);
    }

    private void setStudentData(String name) {
        student.setName(name);
        student.setScores(studentScore);
    }
}
