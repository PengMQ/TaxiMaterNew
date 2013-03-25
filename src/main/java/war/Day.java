package war;


public class Day implements TimeDetector{
    private static final double BASE_PRICE = 8.0;
    private static final double UNIT_PRICE = 2.0;

    public double getBasePrice() {
        return BASE_PRICE;
    }
    public double getUnitPrice() {
        return UNIT_PRICE;
    }
}
