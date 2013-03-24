package war;


public class TaxiMeter {

    private static final double BASE_DISTANCE = 3.0;
    private static final double DAY_BASE_PRICE = 8.0;
    private static final double UNIT_PRICE = 2.0;
    private static final double NIGHT_BASE_PRICE = 10.0;

    public double calculate(double distance, boolean isNight) {
        if(distance > BASE_DISTANCE){
            return getBasePrice(isNight) + UNIT_PRICE * (int)(distance - BASE_DISTANCE);
        }
        return getBasePrice(isNight);
    }

    private double getBasePrice(boolean isNight) {
        if(isNight){
            return NIGHT_BASE_PRICE;
        }
        return DAY_BASE_PRICE;
    }

    public double calculate2(double distance, Night night) {
        return night.getBasePrice();
    }
}
