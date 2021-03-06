package info.vladyslav.EPAM_HW_09_1223.structural.bridge;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress...");
        developer.wrightCode();
    }
}
