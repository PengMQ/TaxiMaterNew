package war;


public class ShuangliuDay implements TimeDetector {
    private static  final double BASE_PRICE = 6.0;
    private static final double UNIT_PRICE = 1.5;

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getUnitPrice() {
        return UNIT_PRICE;
    }
}
