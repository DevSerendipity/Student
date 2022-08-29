package Student;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class StudentDetails extends Student {
    private final int MAX_SCORE = 100;
    private final int NUMBER_OF_SUBJECTS = 5;

    protected Map<String, Integer> getStudentScore() {
        Map<String, Integer> score = new HashMap<>();
        score.put("Test" + IntStream.range(0, NUMBER_OF_SUBJECTS).count(), (int) (Math.random() * MAX_SCORE) + 1);
        return score;
    }

    protected double studentAverageScore() {
        double studentAverageScore = getStudentAverageScore();
        studentAverageScore += getStudentScore().values().stream().mapToDouble(v -> v).sum();
        return studentAverageScore / NUMBER_OF_SUBJECTS;
    }

    protected double getStudentGrade() {
        double grade = getGrade();
        grade += getStudentScore().values().stream().mapToDouble(v -> v).sum();
        return grade / MAX_SCORE;
    }
}
