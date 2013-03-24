package war;


public class TaxiMeter {

    private static final double baseDistance = 3.0;
    private static final double basePrice = 8.0;
    private static final double unitPrice = 2.0;

    public double calculate(double distance) {
        if(distance > baseDistance){
            return basePrice + unitPrice * (int)(distance - baseDistance);
        }
        return basePrice;
    }
}
