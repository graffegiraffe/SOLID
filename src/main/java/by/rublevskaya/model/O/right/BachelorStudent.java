package by.rublevskaya.model.O.right;

public class BachelorStudent implements Student{
    private final String name;

    public BachelorStudent(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Bachelor student: " + name);
    }
}
