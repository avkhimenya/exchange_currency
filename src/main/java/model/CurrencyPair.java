package model;

public class CurrencyPair {

    private final Currency currencyTo;
    private final Currency currency;

    private final String currencyToCode;
    private final String currencyCode;

    private final int currencyToDigitalCode;
    private final int currencyDigitalCode;

    public CurrencyPair(Currency currencyTo, Currency currency) {
        this.currencyTo = currencyTo;
        this.currency = currency;

        this.currencyToCode = currencyTo.getCode();
        this.currencyCode = currency.getCode();

        // цифровые коды валют
        this.currencyToDigitalCode = currencyTo.getDigitalCode();
        this.currencyDigitalCode = currency.getDigitalCode();
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getCurrencyToCode() {
        return currencyToCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public int getCurrencyToDigitalCode() {
        return currencyToDigitalCode;
    }

    public int getCurrencyDigitalCode() {
        return currencyDigitalCode;
    }

    // стыдно за это решение, но ничего лучше не придумал
    public String getPairCode() {
        return Integer.toString(getCurrencyToDigitalCode())
                .concat(Integer.toString(getCurrencyDigitalCode()));
    }

}
