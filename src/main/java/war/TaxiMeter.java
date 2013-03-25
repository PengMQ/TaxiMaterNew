package war;


public class TaxiMeter {

    private static final double BASE_DISTANCE = 3.0;
    public static final double ADDITIONAL_PRICE = 20.0;

    public double calculate(double distance, TimeDetector timeDetector) {
        if(distance > BASE_DISTANCE){
            return timeDetector.getBasePrice() + getAdditionalPrice(distance, timeDetector);
        }
        return timeDetector.getBasePrice();
    }

    private double getAdditionalPrice(double distance, TimeDetector timeDetector) {
        return timeDetector.getUnitPrice() * (int)(distance - BASE_DISTANCE);
    }



    public double calculateRegion(City shuangLiu) {
        if(shuangLiu.getDistance()> BASE_DISTANCE) {
           return  shuangLiu.getBasePrice() + getAdditionalPriceOfRegion(shuangLiu.getDistance(), shuangLiu);
        }

        return shuangLiu.getBasePrice();
    }

    private double getAdditionalPriceOfRegion(double distance, City shuangLiu) {
        return (distance - BASE_DISTANCE) * shuangLiu.getUnitPrice();
    }
    //Start from shuangliu
    public double calculateFromShuangliuToChengdu(City shuangliu, City chengdu) {
        if(chengdu.getDistance() >  0){
            return calculateRegion(shuangliu) + ADDITIONAL_PRICE + chengdu.getDistance() * chengdu.getUnitPrice();
        }
        return calculateRegion(shuangliu);

    }

    public double calculateFromChengduToShuangliu(City shuangliu, City chengdu) {
        if(chengdu.getDistance() > BASE_DISTANCE){
            return chengdu.getBasePrice() + ADDITIONAL_PRICE
                    + getAdditionalPriceForShuangliuCarInChengdu(chengdu)
                    + (int)shuangliu.getDistance() * shuangliu.getUnitPrice();
        }
        return chengdu.getBasePrice() + ADDITIONAL_PRICE;

    }

    private double getAdditionalPriceForShuangliuCarInChengdu(City chengdu) {
        return (chengdu.getUnitPrice() * (int)(chengdu.getDistance() - BASE_DISTANCE));
    }
}
