package war;


public class ShuangLiu {
    private static  final double BASE_PRICE = 6.0;
    private static final double unitPrice = 1.5;
    private double distance;

    public ShuangLiu(double distance) {
        this.distance = distance;
    }

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDistance() {
        return distance;
    }
}
