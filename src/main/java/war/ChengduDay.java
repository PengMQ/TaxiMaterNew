package war;


public class ChengduDay implements TimeDetector{
    private static final double BASE_PRICE = 8.0;
    private static final double UNIT_PRICE = 2.0;
    private static final double ADDITIONAL_PRICE = 0.0;

    public double getBasePrice() {
        return BASE_PRICE;
    }
    public double getUnitPrice() {
        return UNIT_PRICE;
    }

    public double getExtraPrice() {
        return ADDITIONAL_PRICE;
    }
}
