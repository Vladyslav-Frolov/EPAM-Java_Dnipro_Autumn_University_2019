package info.vladyslav.EPAM_HW_09_1223.behavioral.visitor;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
