package by.rublevskaya.model.D.right;

import java.util.List;

public class University {
    private List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    public void organizeStudies() {
        System.out.println("Organization of training:");
        for (Student student : students) {
            student.study();
        }
    }
}
