package view;

import model.Currency;
import model.CurrencyPair;
import model.ExchangeRate;

public class Output {

    ExchangeRate exchangeRate;

    public void scoreboard(Currency currencyTo, Currency currency) {
        exchangeRate = new ExchangeRate(new CurrencyPair(currencyTo, currency));
        System.out.println("1.0 ["
                + exchangeRate.getCurrencyPair().getCurrencyTo().getCode() + "] --> "
                + exchangeRate.getCourse() + " ["
                + exchangeRate.getCurrencyPair().getCurrency().getCode() + "]");
    }

}
