import currency.*;

public class ExchangeRateDate {

    private final Double course;

    // временная реализация класса
    // данный класс возвращает курс относительно двух валют по определнной дате
    ExchangeRateDate(String date, Currency currencyTo, Currency currency) {
        // в будущем на основе параметра date будет приходить course
        if(currencyTo instanceof Dollar && currency instanceof Ruble) {
            course = 74.11;
        } else if(currencyTo instanceof Ruble && currency instanceof Dollar) {
            course = 0.01344;
        } else {
            course = 1d;
        }
    }

    public Double getCourse() {
        return course;
    }
}
