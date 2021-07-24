package adapter;

/**
 *
 * @author Weslei
 */
public class CurrencyUSD implements Payment{
    private double usd;

    @Override
    public double getPayment() {
        return this.usd;
    }

    @Override
    public void setPayment(double usd) {
        this.usd = usd;
    }
}
