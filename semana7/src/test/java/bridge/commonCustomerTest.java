package bridge;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class commonCustomerTest {
    
    @Test
    public void mustReturnDiscountCommonCustomerDiscountRange1() {        
        Discount discount = new DiscountRange1();
        CommonCustomer commonCustomer = new CommonCustomer(100.0f);
        commonCustomer.setDiscount(discount);
        assertEquals(20.0f, commonCustomer.calculateDiscount(), 0.01f);
    }
    
    @Test
    public void mustReturnDiscountCommonCustomerDiscountRange2() {        
        Discount discount = new DiscountRange2();
        CommonCustomer commonCustomer = new CommonCustomer(100.0f);
        commonCustomer.setDiscount(discount);
        assertEquals(30.0f, commonCustomer.calculateDiscount(), 0.01f);
    }
    
}
