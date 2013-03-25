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

    @Test
    public void shouldPay10WhenInBaseDistanceAtNight() throws Exception {
        Night night = new Night();
        double actualPayment = taxiMeter.calculate(2.0, night);
        assertThat(actualPayment, is(10.0));

    }

    @Test
    public void shouldPay13WhenDistanceIs4KMAtNight() throws Exception {
        Night night = new Night();
        double actualPayment = taxiMeter.calculate(4.0, night);
        assertThat(actualPayment, is(13.0));
    }

    @Test
    public void shouldPay10WhenDistanceIs3_5KMAtNight() throws Exception {
        Night night = new Night();
        double actualPayment = taxiMeter.calculate(3.5, night);
        assertThat(actualPayment, is(10.0));
    }

    @Test
    public void shouldPay8WhenInBaseDistanceInDay() throws Exception {
        Day day = new Day();
        double actualPayment = taxiMeter.calculate(2, day);
        assertThat(actualPayment, is(8.0));
    }

    @Test
    public void shouldPay10WhenDistanceIs4KMInDay() throws Exception {
        Day day = new Day();
        double actualPayment = taxiMeter.calculate(4.0, day);
        assertThat(actualPayment, is(10.0));
    }

    //shuangliu's car starts form shuangliu
    @Test
    public void shouldPayBasePriceInBaseDistanceInShuangliu() throws Exception {

        ShuangLiu shuangLiu = new ShuangLiu(2.0);
        ChengDu chengdu = new ChengDu(0.0, new Day());

        double payment = taxiMeter.calculateBetweenRegions(shuangLiu, chengdu);

        assertThat(payment, is(6.0));

    }

    @Test
    public void shouldPay9WhenDistanceIs5InShuangLiu() throws Exception {

        ShuangLiu shuangliu = new ShuangLiu(5.0);
        ChengDu chengdu = new ChengDu(0.0, new Day());

        double payment = taxiMeter.calculateBetweenRegions(shuangliu, chengdu);

        assertThat(payment, is(9.0));

    }

    @Test
    public void shouldPay30WhenShuangliuIs3KMAndChengduIs2KM() throws Exception {

        ShuangLiu shuangliu = new ShuangLiu(3.0);
        ChengDu chengdu = new ChengDu(2.0, new Day());

        double actualPayment = taxiMeter.calculateBetweenRegions(shuangliu, chengdu);

        assertThat(actualPayment, is(30.0));
    }

    //shuangliu's car starts form chengdu

    @Test
    public void shouldPay28WhenDistanceIs2KMInChengdu() throws Exception {
        ShuangLiu shuangliu = new ShuangLiu(0.0);
        ChengDu chengdu = new ChengDu(2.0, new Day());
        double actualPayment = taxiMeter.calculate2(shuangliu, chengdu);
        assertThat(actualPayment, is(28.0));
    }

    @Test
    public void shouldPay30WhenDistanceIs4KMInChengdu() throws Exception {
        ChengDu chengdu = new ChengDu(4.0, new Day());
        ShuangLiu shuangliu = new ShuangLiu(0.0);
        double actualPayment = taxiMeter.calculate2(shuangliu, chengdu);
        assertThat(actualPayment, is(30.0));
    }

    @Test
    public void shouldPay30WhenDistanceIs4_5KMInChengdu() throws Exception {
        ShuangLiu shuangliu = new ShuangLiu(0.0);
        ChengDu chengdu = new ChengDu(4.5, new Day());
        double actualPayment = taxiMeter.calculate2(shuangliu, chengdu);
        assertThat(actualPayment, is(30.0));
    }

    @Test
    public void shouldPay31_5WhenChengduIs4AndShuangliuIs1() throws Exception {
        ShuangLiu shuangliu = new ShuangLiu(1.0);
        ChengDu chengdu = new ChengDu(4.0, new Day());
        double actualPayment = taxiMeter.calculate2(shuangliu, chengdu);
        assertThat(actualPayment,is(31.5));

    }
}
