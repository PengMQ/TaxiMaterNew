package war;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TaxiMeterTest {

    private TaxiMeter taxiMeter;

    @Before
    public void setUp() throws Exception {
        taxiMeter = new TaxiMeter();
    }

    /**
     * ***********test for chengdu at night*****************
     */
    @Test
    public void shouldPay10WhenInBaseDistanceAtNight() throws Exception {

        double payment = taxiMeter.calculateOneCity(new City(2.0, new ChengduNight()));
        assertThat(payment, is(10.0));

    }

    @Test
    public void shouldPay13WhenDistanceIs4KMAtNight() throws Exception {

        double payment = taxiMeter.calculateOneCity(new City(4.0, new ChengduNight()));
        assertThat(payment, is(13.0));
    }

    @Test
    public void shouldPay10WhenDistanceIs3_5KMAtNight() throws Exception {

        double payment = taxiMeter.calculateOneCity(new City(3.5, new ChengduNight()));
        assertThat(payment, is(10.0));
    }

    /**
     * **********test for chengdu in day*****************
     */
    @Test
    public void shouldPay8WhenInBaseDistanceInDay() throws Exception {

        double payment = taxiMeter.calculateOneCity(new City(2.0, new ChengduDay()));
        assertThat(payment, is(8.0));
    }

    @Test
    public void shouldPay10WhenDistanceIs4KMInDay() throws Exception {

        double payment = taxiMeter.calculateOneCity(new City(4.0, new ChengduDay()));
        assertThat(payment, is(10.0));
    }

    //shuangliu's car starts form shuangliu
    @Test
    public void shouldPayBasePriceInBaseDistanceInShuangliu() throws Exception {

        City shuangLiu = new City(2.0, new ShuangliuDay());
        City chengdu = new City(0.0, new ChengduDay());

        double payment = taxiMeter.calculateBetweenCities(shuangLiu, chengdu, shuangLiu);
        assertThat(payment, is(6.0));

    }

    @Test
    public void shouldPay9WhenDistanceIs5InShuangLiu() throws Exception {

        City shuangliu = new City(5.0, new ShuangliuDay());
        City chengdu = new City(0.0, new ChengduDay());

        double payment = taxiMeter.calculateBetweenCities(shuangliu, chengdu, shuangliu);
        assertThat(payment, is(9.0));

    }

    @Test
    public void shouldPay30WhenShuangliuIs3KMAndChengduIs2KM() {

        City shuangliu = new City(3.0, new ShuangliuDay());
        City chengdu = new City(2.0, new ChengduDay());

        double actualPayment = taxiMeter.calculateBetweenCities(shuangliu, chengdu, shuangliu);
        assertThat(actualPayment, is(30.0));
    }



    //shuangliu's car starts form chengdu

    @Test
    public void shouldPay28WhenDistanceIs2KMInChengdu() throws Exception {

        City shuangliu = new City(0.0, new ShuangliuDay());
        City chengdu = new City(2.0, new ChengduDay());

        double payment = taxiMeter.calculateBetweenCities(chengdu, shuangliu, shuangliu);
        assertThat(payment, is(28.0));
    }
    @Test
    public void shouldPay30WhenDistanceIs4KMInChengdu() throws Exception {

        City chengdu = new City(4.0, new ChengduDay());
        City shuangliu = new City(0.0, new ShuangliuDay());

        double payment = taxiMeter.calculateBetweenCities(chengdu, shuangliu, shuangliu);
        assertThat(payment, is(30.0));
    }

    @Test
    public void shouldPay30WhenDistanceIs4_5KMInChengdu() throws Exception {

        City shuangliu = new City(0.0, new ShuangliuDay());
        City chengdu = new City(4.5, new ChengduDay());

        double payment = taxiMeter.calculateBetweenCities(chengdu, shuangliu, shuangliu);
        assertThat(payment, is(30.0));
    }
    @Test
    public void shouldPay31_5WhenChengduIs4AndShuangliuIs1() throws Exception {

        City shuangliu = new City(1.0, new ShuangliuDay());
        City chengdu = new City(4.0, new ChengduDay());

        double payment = taxiMeter.calculateBetweenCities(chengdu, shuangliu, shuangliu);
        assertThat(payment, is(31.5));

    }
}
