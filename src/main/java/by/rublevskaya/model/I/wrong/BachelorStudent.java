package by.rublevskaya.model.I.wrong;

public class BachelorStudent implements StudentActions {
    @Override
    public void study() {
        System.out.println("A bachelor studies in pairs");
    }

    @Override
    public void submitThesis() {
        System.out.println("Bachelor's degree student submits bachelor's degree diploma");
    }

    @Override
    public void conductResearch() {
        throw new UnsupportedOperationException("Bachelors do not do research work");
    }

    @Override
    public void organizeClubActivity() {
        throw new UnsupportedOperationException("Bachelors do not engage in extracurricular activities");
    }
}