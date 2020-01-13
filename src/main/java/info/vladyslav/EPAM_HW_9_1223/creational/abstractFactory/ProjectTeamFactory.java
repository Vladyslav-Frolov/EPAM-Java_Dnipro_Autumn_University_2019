package info.vladyslav.EPAM_HW_9_1223.creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
