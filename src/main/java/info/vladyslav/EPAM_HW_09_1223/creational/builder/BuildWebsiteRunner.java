package info.vladyslav.EPAM_HW_09_1223.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriceWebsiteBuilder());
        Website website1 = director.buildWebsite();

        director.setBuilder(new VisitCardWebsiteBuilder() );
        Website website2 = director.buildWebsite();

        System.out.println(website1);
        System.out.println(website2);
    }

}
