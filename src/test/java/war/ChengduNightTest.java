package war;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ChengduNightTest {
    private ChengduNight chengduNight;

    @Before
    public void setUp() throws Exception {
        chengduNight = new ChengduNight();
    }

    @Test
    public void shouldReturnBasePriceOfNight() throws Exception {
        double basePrice = chengduNight.getBasePrice();
        assertThat(basePrice, is(10.0));

    }

    @Test
    public void shouldReturnUnitPriceOfNight() throws Exception {
        double unitPrice = chengduNight.getUnitPrice();
        assertThat(unitPrice, is(3.0));
    }
}
