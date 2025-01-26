package by.rublevskaya.model.O.right;

public class MasterStudent implements Student {
    private final String name;

    public MasterStudent(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Master's student: " + name);
    }
}
