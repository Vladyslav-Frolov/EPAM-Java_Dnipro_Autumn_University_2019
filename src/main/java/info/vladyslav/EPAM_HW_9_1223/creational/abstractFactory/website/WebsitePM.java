package info.vladyslav.EPAM_HW_9_1223.creational.abstractFactory.website;

import info.vladyslav.EPAM_HW_9_1223.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
