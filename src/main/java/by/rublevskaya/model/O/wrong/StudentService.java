package by.rublevskaya.model.O.wrong;

public class StudentService {

    public void printInfo(String studentType, String name) {

        if ("bachelor".equals(studentType)) {
            System.out.println("Bachelor student: " + name);
        } else if ("Master".equals(studentType)) {
            System.out.println("Master's student: " + name);
        } else if ("Postgraduate".equals(studentType)) {
            System.out.println("Postgraduate student: " + name);
        } else {
            System.out.println("Unknown student type: " + name);
        }
    }
}
