package by.rublevskaya.model.S.right;

public class StudentReport {
    private final StudentStatistics statistics;

    public StudentReport(StudentStatistics statistics) {
        this.statistics = statistics;
    }

    public void printReport(Student student) {
        System.out.println("Student Report: " + student.getName());
        System.out.printf("Average rating: %.2f%n", statistics.calculateAverageGrade(student));
    }
}
