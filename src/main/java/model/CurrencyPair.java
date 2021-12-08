package model;

public class CurrencyPair {

    private final Currency currencyTo;
    private final Currency currency;

    public CurrencyPair(Currency currencyTo, Currency currency) {
        this.currencyTo = currencyTo;
        this.currency = currency;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getCurrencyToDigitalCode() {
        return currencyTo.getDigitalCode();
    }

    public int getCurrencyDigitalCode() {
        return currency.getDigitalCode();
    }

    public String getCurrencyToCode() {
        return currencyTo.getCode();
    }

    public String getCurrencyCode() {
        return currency.getCode();
    }

    // стыдно за это решение, но ничего лучше не придумал :'(
    public String getPairCode() {
        return Integer.toString(getCurrencyToDigitalCode())
                .concat(Integer.toString(getCurrencyDigitalCode()));
    }

}
