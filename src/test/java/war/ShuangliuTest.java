package war;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShuangliuTest {
    private ShuangLiu shuangli;

    @Before
    public void setUp() throws Exception {
        shuangli = new ShuangLiu(0.0);
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
