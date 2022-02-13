package Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static final ArrayList<Student> studentArrayList = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);
    private static final Map<String,Integer> studentScore= new HashMap<>();
    private static boolean continuePlaying = true;
    private static final Student student = new Student();

    public static void main(String[] args) {
        while(continuePlaying) {
            System.out.println("If you want to exit. Press 1");
            System.out.println("If you want to add student information. Press 2");
            System.out.println("If you want to update student information. Press 3");
            System.out.println("If you want to delete Student. Press 4");
            System.out.println("If you want to generate student information. Press 5");
            int gameEnd = input.nextInt();
            if(gameEnd == 1){
                continuePlaying = false;
                break;
            } else if(gameEnd == 2){
                addStudentInformation();
            }else if(gameEnd == 3){
                updateStudentInformation();
            }else if(gameEnd == 4){
                deleteStudent();
            }else if(gameEnd == 5){
                generateRateStudentInformation();
            }
            studentDetails();
        }
    }

    private static void studentDetails() {
        StudentDetails studentDetails = new StudentDetails();
        student(student.getName(), studentDetails, student);
        student("R", studentDetails, student);
        showCurrentStudents();
    }

    private static void showCurrentStudents() {
        for (Student s : studentArrayList) {
            System.out.printf("Student name %s | student scores %s  | student average score %.2f | student grade %.2f \n", s.getName(), s.getAllScores(), s.getStudentAverageScore(), s.getGrade());
        }
    }

    private static void generateRateStudentInformation() {
        student.setName("NAME");
        StudentDetails studentDetails = new StudentDetails();
        student.setScores(studentDetails.getStudentScore());
    }

    private static void updateStudentInformation() {
        System.out.print("Set new student name: ");
        String name = input.next();
        student.setName(name);
    }

    private static void deleteStudent() {
        studentArrayList.remove(0);
        showCurrentStudents();
    }

    private static void addStudentInformation() {
        System.out.print("Enter student name: ");
        String name = input.next();
        for (int i = 0; i < 5; i++) {
            setStudentScore(i);
        }
        setStudentData(name);
    }

    private static void setStudentScore(int i) {
        System.out.print("Enter details for test number " + i + "\nEnter student test name: ");
        String testName = input.next();
        System.out.print("Enter student test score for test: ");
        int testScore = input.nextInt();
        studentScore.putIfAbsent(testName, testScore);
    }

    private static void setStudentData(String name) {
        student.setName(name);
        student.setScores(studentScore);
    }

    private static void student(String name, StudentDetails studentDetails, Student studentMan) {
        Student student = new Student(name, studentMan.getAllScores(), studentDetails.studentAverageScore(), studentDetails.getStudentGrade());
        studentArrayList.add(student);
    }
}