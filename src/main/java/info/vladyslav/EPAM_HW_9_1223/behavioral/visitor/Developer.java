package info.vladyslav.EPAM_HW_9_1223.behavioral.visitor;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Database database);

    public void create(Test test);
}
