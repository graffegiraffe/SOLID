package by.rublevskaya.model.S.right;

import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
