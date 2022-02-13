package Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDetails extends Student  {
    private final double MAX_SCORE = 100D;
    private final double NUMBER_OF_SUBJECTS = 5;

    protected Map<String, Integer> getStudentScore() {
        Map<String,Integer> score = new HashMap<>();
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            score.put("Test " + i, (int) (Math.random() * MAX_SCORE) + 1);
        }
        return score;
    }

    protected double studentAverageScore() {
        double studentAverageScore = getStudentAverageScore();
        for (Map.Entry<String, Integer> entry : getStudentScore().entrySet()) {
            studentAverageScore += entry.getValue();
        }
        return studentAverageScore / NUMBER_OF_SUBJECTS;
    }

    protected double getStudentGrade() {
        double grade = getGrade();
        for (Map.Entry<String, Integer> entry : getStudentScore().entrySet()) {
            grade += entry.getValue();
        }
        return grade / MAX_SCORE;
    }
}
