package Student;

import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);
    private static boolean continuePlaying = true;
    private static final Teacher teacher = new Teacher();

    public static void main(String[] args) {
        while(continuePlaying) {
            gameMessage();
            int gameEnd = input.nextInt();
            if(gameEnd == 1){
                continuePlaying = false;
                break;
            } else if(gameEnd == 2){
                teacher.addStudentInformation();
            }else if(gameEnd == 3){
                teacher.updateStudentInformation();
            }else if(gameEnd == 4){
                teacher.deleteStudent();
            }else if(gameEnd == 5){
                teacher.generateRateStudentInformation();
            }
            teacher.studentDetails();
        }
    }

    private static void gameMessage() {
        System.out.println("If you want to exit. Press 1");
        System.out.println("If you want to add student information. Press 2");
        System.out.println("If you want to update student information. Press 3");
        System.out.println("If you want to delete Student. Press 4");
        System.out.println("If you want to generate student information. Press 5");
    }

    public  Scanner getInput() {
        return input;
    }
}