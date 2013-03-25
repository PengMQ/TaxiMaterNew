package war;


public class TaxiMeter {

    private static final double BASE_DISTANCE = 3.0;
    public static final double ADDITIONAL_PRICE = 20.0;

    public double calculate(double distance, TimeDetector time) {
        if(distance > BASE_DISTANCE){
            return time.getBasePrice() + getAdditionalPrice(distance, time);
        }
        return time.getBasePrice();
    }

    private double getAdditionalPrice(double distance, TimeDetector time) {
        return time.getUnitPrice() * (int)(distance - BASE_DISTANCE);
    }

    public double calculateRegion(ShuangLiu shuangLiu) {
        if(shuangLiu.getDistance()> BASE_DISTANCE) {
           return  shuangLiu.getBasePrice() + getAdditionalPriceOfRegion(shuangLiu.getDistance(), shuangLiu);
        }

        return shuangLiu.getBasePrice();
    }

    private double getAdditionalPriceOfRegion(double distance, ShuangLiu shuangLiu) {
        return (distance - BASE_DISTANCE) * shuangLiu.getUnitPrice();
    }
    //Start from shuangliu
    public double calculateBetweenRegions(ShuangLiu shuangliu, ChengDu chengdu) {
        if(chengdu.getDistance() >  0){
            return calculateRegion(shuangliu) + ADDITIONAL_PRICE + chengdu.getDistance() * chengdu.getUnitPrice();
        }
        return calculateRegion(shuangliu);

    }

    public double calculate2(ShuangLiu shuangliu, ChengDu chengdu) {
        if(chengdu.getDistance() > BASE_DISTANCE){
            return chengdu.getBasePrice() + ADDITIONAL_PRICE
                    + getAdditionalPriceForShuangliuCarInChengdu(chengdu)
                    + (int)shuangliu.getDistance() * shuangliu.getUnitPrice();
        }
        return chengdu.getBasePrice() + ADDITIONAL_PRICE;

    }

    private double getAdditionalPriceForShuangliuCarInChengdu(ChengDu chengdu) {
        return (chengdu.getUnitPrice() * (int)(chengdu.getDistance() - BASE_DISTANCE));
    }
}
