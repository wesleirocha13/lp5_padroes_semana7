package bridge;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class PremiumCustomerTest {
    
    @Test
    public void mustReturnDiscountPremiumCustomerDiscountRange1() {        
        Discount discount = new DiscountRange1();
        PremiumCustomer premiumCustomer = new PremiumCustomer(100.0f);
        premiumCustomer.setDiscount(discount);
        assertEquals(50.0f, premiumCustomer.calculateDiscount(), 0.01f);
    }
    
    @Test
    public void mustReturnDiscountPremiumnCustomerDiscountRange2() {        
        Discount discount = new DiscountRange2();
        PremiumCustomer premiumCustomer = new PremiumCustomer(100.0f);
        premiumCustomer.setDiscount(discount);
        assertEquals(60.0f, premiumCustomer.calculateDiscount(), 0.01f);
    }    
}
