package by.rublevskaya.model.S.right;

public class StudentStatistics {
    public double calculateAverageGrade(Student student) {
        return student.getGrades().stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
