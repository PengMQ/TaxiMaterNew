package war;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NightTest {
    private Night night;

    @Before
    public void setUp() throws Exception {
        night = new Night();
    }

    @Test
    public void shouldReturnBasePriceOfNight() throws Exception {
        double basePrice = night.getBasePrice();
        assertThat(basePrice, is(10.0));

    }
}
