package by.rublevskaya.model.D.wrong;

public class University {
    private BachelorStudent bachelorStudent;
    private MasterStudent masterStudent;

    public University() {
        this.bachelorStudent = new BachelorStudent();
        this.masterStudent = new MasterStudent();
    }

    public void organizeStudies() {
        System.out.println("Организация обучения:");
        bachelorStudent.study();
        masterStudent.study();
    }
}