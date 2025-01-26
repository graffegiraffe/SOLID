package by.rublevskaya.model.O.right;

public class PostgraduateStudent implements Student{
    private final String name;

    public PostgraduateStudent (String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Postgraduate student: " + name);
    }
}
