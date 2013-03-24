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
        double actualPayment = taxiMeter.calculate(2.0);
        assertThat(actualPayment, is(8.0));
    }

    @Test
    public void shouldPay10WhenDistanceIs4KM() throws Exception {
        double actualPayment = taxiMeter.calculate(4.0);
        assertThat(actualPayment, is(10.0));
    }

    @Test
    public void shouldPay8WhenDistanceIs3_5KM() throws Exception {
        double actualPayment = taxiMeter.calculate(3.5);
        assertThat(actualPayment,is(8.0));
    }
}
