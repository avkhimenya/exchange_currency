import currency.Currency;

public class ExchangeRate {

    Currency currencyTo;
    Currency currency;

    public ExchangeRate(String date, Currency currencyTo, Currency currency) {
        this.currencyTo = currencyTo;
        this.currency = currency;
        ExchangeRateDate exchangeRateDate = new ExchangeRateDate(date, currencyTo, currency);
        new CurrencyPair(currencyTo, currency, exchangeRateDate);
    }

    public void getCourse() {
        System.out.println(currencyTo.getInfo() + " "
        + currency.getInfo());
    }

}
