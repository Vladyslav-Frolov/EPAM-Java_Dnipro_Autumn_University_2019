package info.vladyslav.EPAM_HW_09_1223.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void fifishSprint() {
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
