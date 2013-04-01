package war;


public class ChengduNight implements TimeDetector {
    private static final double BASE_PRICE = 10.0;
    private static final  double unitPrice = 3.0;
    private static final double EXTRA_PRICE = 0.0;

    public double getBasePrice() {
        return BASE_PRICE;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public double getExtraPrice() {
        return EXTRA_PRICE;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
