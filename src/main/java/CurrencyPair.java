import currency.*;

public class CurrencyPair {

    CurrencyPair(Currency currencyTo, Currency currency, ExchangeRateDate exchangeRateDate) {
        currencyTo.setRate(1d);
        currency.setRate(currencyTo.getRate() * exchangeRateDate.getCourse());
    }
}
