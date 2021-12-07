package currency;

public class Dollar implements Currency {

    private static final String CODE = "USD";
    private static final String NAME = "Dollar";
    private Double rate;

    @Override
    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Double getRate() {
        return rate;
    }

    @Override
    public String getCurrencyCode() {
        return CODE;
    }

    @Override
    public String getInfo() {
        return NAME + " [" + CODE + "] = $" + rate;
    }
}
