package Student;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private final double MAX_SCORE = 100D;
    private final double NUMBER_OF_SUBJECTS = 5;

    private final String name;
    private final Map<String,Integer> scores;
    private double studentAverageScore;
    private double grade;

    protected Student(String name , Map<String,Integer> scores, double studentAverageScore,double grade){
        this.name = name;
        this.scores = scores;
        this.studentAverageScore = studentAverageScore;
        this.grade = grade;
    }

    protected Student(){
        name = "";
        scores = new HashMap<>();
        studentAverageScore = 0.0;
        grade = 0;
    }

    protected String getName() {
        return name;
    }

    protected Map<String, Integer> getAllScores() {
        return new HashMap<>(scores);
    }

    protected double getGrade() {
        return grade;
    }

    protected Map<String, Integer> getStudentScore() {
        Map<String,Integer> score = new HashMap<>();
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            score.put("Test " + i, (int) (Math.random() * MAX_SCORE) + 1);
        }
        return score;
    }

    protected double getStudentAverageScore() {
        for (Map.Entry<String, Integer> entry : getStudentScore().entrySet()) {
            studentAverageScore += entry.getValue();
        }
        return studentAverageScore / NUMBER_OF_SUBJECTS;
    }

    protected double getStudentGrade() {
        for (Map.Entry<String, Integer> entry : getStudentScore().entrySet()) {
            grade += entry.getValue();
        }
        return grade / MAX_SCORE;
    }
}