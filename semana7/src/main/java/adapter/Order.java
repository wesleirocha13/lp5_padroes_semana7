
package adapter;

/**
 *
 * @author Weslei
 */
public class Order {
    
    Payment payment;
    CurrencyAdapter currencyAdapter;

    public Order() {
        payment = new CurrencyUSD();
        currencyAdapter = new CurrencyAdapter(payment);
    }

    public void setPayment(double usd) {
        payment.setPayment(usd);
        currencyAdapter.convertCurrency();
    }

    public double getPayment() {
        return currencyAdapter.getConvertedCurrency();
    }

}
