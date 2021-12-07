package currency;

public class Ruble implements Currency {

    private static final String CODE = "RUB";
    private static final String NAME = "Ruble";
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
        return NAME + " [" + CODE + "] = " + rate + "₽";
    }
}
