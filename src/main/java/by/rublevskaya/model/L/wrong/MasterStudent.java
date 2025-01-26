package by.rublevskaya.model.L.wrong;

//нарушает:(
public class MasterStudent extends Student {
    @Override
    public String getStudentType() {
        throw new UnsupportedOperationException("Masters do not support call getStudentType()");
    }
}
