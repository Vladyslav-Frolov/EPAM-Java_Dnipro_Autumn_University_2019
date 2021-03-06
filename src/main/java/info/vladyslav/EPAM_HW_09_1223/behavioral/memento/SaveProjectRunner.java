package info.vladyslav.EPAM_HW_09_1223.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1");

        System.out.println(project);

        System.out.println("Saving current version to Github... ");
        github.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Wright poor code...");

        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1.");

        System.out.println(project);

        System.out.println("Something went wrong");

        System.out.println("Rolling back to Version 1.0");
        project.load(github.getSave());

        System.out.println("Project after roll back");

    }
}
