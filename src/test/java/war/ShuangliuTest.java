package war;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShuangliuTest {
    private City shuangli;

    @Before
    public void setUp() throws Exception {
        ShuangliuDay shuangliuDay = new ShuangliuDay();
        shuangli = new City(0.0,shuangliuDay);
    }

    @Test
    public void shouldReturnBasePrice() throws Exception {
        double basePrice = shuangli.getBasePrice();
        assertThat(basePrice,is(6.0));

    }

    @Test
    public void shouldRetuenUnitPrice() throws Exception {
        double unitPrice = shuangli.getUnitPrice();
        assertThat(unitPrice,is(1.5));
    }
}
