package Student;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private final double studentAverageScore;
    private final double grade;
    private String name;
    private Map<String, Integer> scores;

    protected Student(String name, Map<String, Integer> scores, double studentAverageScore, double grade) {
        this.name = name;
        this.scores = scores;
        this.studentAverageScore = studentAverageScore;
        this.grade = grade;
    }

    protected Student() {
        name = "";
        scores = new HashMap<>();
        studentAverageScore = 0.0;
        grade = 0;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Map<String, Integer> getAllScores() {
        return new HashMap<>(scores);
    }

    protected void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    protected double getGrade() {
        return grade;
    }

    protected double getStudentAverageScore() {
        return studentAverageScore;
    }
}
