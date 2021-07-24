package bridge;

/**
 *
 * @author Weslei
 */
public class PremiumCustomer extends Customer{
    float additionalDiscount = 0.4f;
     public PremiumCustomer(float valueOrder) {
        super(valueOrder);
    }

    public float calculateDiscount() {
        return this.valueOrder * (additionalDiscount+this.discount.discountPercentage());
    }
}
