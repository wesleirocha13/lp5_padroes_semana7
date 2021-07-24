package adapter;

/**
 *
 * @author Weslei
 */
public class CurrencyAdapter extends CurrencyBRL{
    private Payment currencyUSD;

    public CurrencyAdapter(Payment currencyUSD) {
        this.currencyUSD = currencyUSD;
    }

    public double getConvertedCurrency() {
        double actualyValueUSD = 5.20;  
        double value = this.getCurrencyBRL()/actualyValueUSD;
        currencyUSD.setPayment(value);        
        return currencyUSD.getPayment();
    }

    public void convertCurrency() {
        double actualyValueUSD = 5.20;        
        double value = currencyUSD.getPayment()*actualyValueUSD;        
        this.setCurrencyBRL(value);        
    }
}
