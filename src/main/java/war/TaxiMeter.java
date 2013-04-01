package war;


public class TaxiMeter {

    private static final double BASE_DISTANCE = 3.0;

    public double calculateOneCity(City city) {
        if (city.getDistance() > BASE_DISTANCE) {
            return city.getBasePrice() + calculateAdditionalPriceForFromCity(city);
        }

        return city.getBasePrice();
    }

    public double calculateBetweenCities(City fromCity, City toCity, City sourceCity) {
        return calculateOneCity(fromCity)
                + calculateAdditionalPriceForToCity(toCity)
                + getExtraPrice(fromCity, toCity, sourceCity);

    }

    private double calculateAdditionalPriceForToCity(City city) {
        return (int) city.getDistance() * city.getUnitPrice();
    }


    private double calculateAdditionalPriceForFromCity(City city) {
        return (int) (city.getDistance() - BASE_DISTANCE) * city.getUnitPrice();
    }

    public double getExtraPrice(City fromCity, City toCity, City sourceCity) {
        if(toCity != sourceCity && toCity.getDistance() > 0 || fromCity != sourceCity){
            return sourceCity.getExtraPrice();
        }
        return 0.0;

    }
}
