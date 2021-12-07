package currency;

public interface Currency {

    void setRate(Double rate);

    String getName();

    Double getRate();

    String getCurrencyCode();

    String getInfo();

}

