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
    public void shouldPay8InBaseDistance() throws Exception {
        boolean isNight = false;
        double actualPayment = taxiMeter.calculate(2.0, isNight);
        assertThat(actualPayment, is(8.0));
    }

    @Test
    public void shouldPay10WhenDistanceIs4KM() throws Exception {
        boolean isNight = false;
        double actualPayment = taxiMeter.calculate(4.0, isNight);
        assertThat(actualPayment, is(10.0));
    }

    @Test
    public void shouldPay8WhenDistanceIs3_5KM() throws Exception {
        boolean isNight = false;
        double actualPayment = taxiMeter.calculate(3.5, isNight);
        assertThat(actualPayment, is(8.0));
    }

    @Test
    public void shouldPay10WhenInBaseDistanceAndNight() throws Exception {
        boolean isNight = true;
        double actualPayment = taxiMeter.calculate(2.0,isNight);
        assertThat(actualPayment,is(10.0));
    }

    @Test
    public void shouldPay10WhenInBaseDistanceAndNight2() throws Exception {
        Night night = new Night();
        double actualPayment = taxiMeter.calculate2(2.0, night);
        assertThat(actualPayment,is(10.0));

    }

}
