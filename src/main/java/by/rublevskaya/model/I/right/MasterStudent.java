package by.rublevskaya.model.I.right;

public class MasterStudent implements Studying, ThesisSubmitting, ResearchConducting {
    @Override
    public void study() {
        System.out.println("Master studies in advanced courses");
    }

    @Override
    public void submitThesis() {
        System.out.println("Master submits master's thesis");
    }

    @Override
    public void conductResearch() {
        System.out.println("The master is conducting research work");
    }
}
