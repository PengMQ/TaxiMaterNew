package war;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChengduDayTest {
    private ChengduDay chengduDay;

    @Before
    public void setUp() throws Exception {
        chengduDay = new ChengduDay();
    }

    @Test
    public void shouldReturnBasePriceOfDay() throws Exception {
        double basePrice = chengduDay.getBasePrice();
        assertThat(basePrice,is(8.0));

    }
}
