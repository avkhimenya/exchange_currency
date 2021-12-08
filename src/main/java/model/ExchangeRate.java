package model;

import java.util.HashMap;

public class ExchangeRate {

    private final Double course;
    private final CurrencyPair currencyPair;

    /* здесь вычисляется курс на основе валютной пары и даты
    * далее валютная пара и курс сохраняются в коллекцию */

    public ExchangeRate(CurrencyPair currencyPair) {
        this.currencyPair = currencyPair;
        int pairCode = Integer.parseInt(currencyPair.getPairCode());

        if (currencyPair.getCurrencyToDigitalCode() == currencyPair.getCurrencyDigitalCode()) {
            this.course = 1d;
        } else {
            this.course = allExchangeRate().get(pairCode);
        }
    }

    private HashMap<Integer, Double> allExchangeRate() {
        /* вот здесь должен быть реализован алгоритм который высчитывает
         * всевозможные комбинации Currency.getCodes() и записывает их в мапу одним числом
         * например комбинация из кодов 810 (рубль) и 840 (доллар) запишется как 810840
         * тут же высчитывается курс для этой комбинации c помощью метода searchRate(Date date, int comb)
         * который я хочу реализовать с помощью валютного API (?)
         * пока что сделаю решение "в лоб" (с) так говорил мой математик :) */
        HashMap<Integer, Double> allCodes = new HashMap<>();

        allCodes.put(810840, 0.01343); // 810 -> 840
        allCodes.put(810978, 0.012032); // 810 -> 978
        allCodes.put(840810, 73.64); // 840 -> 810
        allCodes.put(840978, 0.8855); // 840 -> 978
        allCodes.put(978810, 83.04); // 978 -> 810
        allCodes.put(978840, 1.13); // 978 -> 840

        return allCodes;
    }

    public Double getCourse() {
        return course;
    }

    public CurrencyPair getCurrencyPair() {
        return currencyPair;
    }
}

