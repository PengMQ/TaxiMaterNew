package war;


public class ChengDu {
    private double distance;
    private TimeDetector timeDetector;

    public ChengDu(double distance, TimeDetector timeDetector) {
        this.distance = distance;
        this.timeDetector = timeDetector;
    }

    public  double getDistance() {
        return distance;
    }

    public double getUnitPrice() {
        return timeDetector.getUnitPrice();
    }

    public double getBasePrice() {
        return timeDetector.getBasePrice();
    }
}
