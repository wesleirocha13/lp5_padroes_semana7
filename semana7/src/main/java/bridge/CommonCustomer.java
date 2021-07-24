package bridge;

/**
 *
 * @author Weslei
 */
public class CommonCustomer extends Customer{
    float additionalDiscount = 0.1f;
    public CommonCustomer(float valueOrder) {
        super(valueOrder);
    }

    public float calculateDiscount() {
        return this.valueOrder * (additionalDiscount + this.discount.discountPercentage());
    }

}
