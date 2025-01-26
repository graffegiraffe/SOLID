package by.rublevskaya.model.I.right;

public class BachelorStudent implements Studying, ThesisSubmitting {
    @Override
    public void study() {
        System.out.println("A bachelor studies in pairs");
    }

    @Override
    public void submitThesis() {
        System.out.println("Bachelor's degree student submits bachelor's degree diploma");
    }
}
