package war;


public class TaxiMeter {

    private static final double BASE_DISTANCE = 3.0;
    public static final double ADDITIONAL_PRICE = 20.0;

    public double calculateOneCity(City city) {
        if (city.getDistance() > BASE_DISTANCE) {
            return city.getBasePrice() + calculateAdditionalPriceForFromCity(city);
        }

        return city.getBasePrice();
    }

    public double calculateFromShuangliuToChengdu(City shuangliu, City chengdu) {
        if (chengdu.getDistance() > 0) {
            return calculateOneCity(shuangliu)
                    + calculateAdditionalPriceForToCity(chengdu)
                    + ADDITIONAL_PRICE;
        }
        return calculateOneCity(shuangliu);

    }

    public double calculateFromChengduToShuangliu(City shuangliu, City chengdu) {
        if (chengdu.getDistance() > BASE_DISTANCE) {
            return chengdu.getBasePrice()
                    + calculateAdditionalPriceForFromCity(chengdu)
                    + calculateAdditionalPriceForToCity(shuangliu)
                    + ADDITIONAL_PRICE;
        }
        return chengdu.getBasePrice() + ADDITIONAL_PRICE;

    }

    private double calculateAdditionalPriceForToCity(City city) {
        return (int) city.getDistance() * city.getUnitPrice();
    }


    private double calculateAdditionalPriceForFromCity(City city) {
        return (int) (city.getDistance() - BASE_DISTANCE) * city.getUnitPrice();
    }
}
