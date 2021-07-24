package adapter;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderTest {

    @Test
    public void mustReturnCurrencyOrder() {
        Order order = new Order();
        order.setPayment(1.0);
        assertEquals(1.0, order.getPayment(),0.1);
    }    
}
