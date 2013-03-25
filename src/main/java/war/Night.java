package war;


public class Night implements TimeDetector {
    private static final double BASE_PRICE = 10.0;
    private static final  double unitPrice = 3.0;

    public double getBasePrice() {
        return BASE_PRICE;
    }


    public double getUnitPrice() {
        return unitPrice;
    }
}
