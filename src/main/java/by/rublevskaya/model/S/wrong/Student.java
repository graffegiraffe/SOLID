package by.rublevskaya.model.S.wrong;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void printReport() {
        System.out.println("Student Report: " + name);
        System.out.println("Average rating: " + calculateAverageGrade());
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
