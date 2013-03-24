package war;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NightTest {
    private Day day;

    @Before
    public void setUp() throws Exception {
        day = new Day();
    }

    @Test
    public void shouldReturnBasePriceOfDay() throws Exception {
        double basePrice = day.getBasePrice();
        assertThat(basePrice, is(8.0));


    }
}
