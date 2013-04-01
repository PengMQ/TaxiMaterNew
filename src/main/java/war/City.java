package war;


public class City{
    private double distance;
    private TimeDetector timeDetector;

    public City(double distance, TimeDetector timeDetector) {
        this.distance = distance;
        this.timeDetector = timeDetector;

    }

    public double getBasePrice() {
        return timeDetector.getBasePrice();
    }

    public double getUnitPrice() {
        return timeDetector.getUnitPrice();
    }

    public double getDistance() {
        return distance;
    }

    public double getExtraPrice(){
        return timeDetector.getExtraPrice();
    }
}
