package bridge;

/**
 *
 * @author Weslei
 */
public abstract class Customer {
    protected Discount discount;

    protected float valueOrder;

    public Customer(float valueOrder) {
        this.valueOrder = valueOrder;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setValueOrder(float valueOrder) {
        this.valueOrder = valueOrder;
    }

    public abstract float calculateDiscount();
}
