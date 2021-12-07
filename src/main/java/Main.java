import currency.Dollar;
import currency.Ruble;

public class Main {

    public static void main(String[] args) {

        // 1 доллар в рубли
        ExchangeRate dollarToRubles = new ExchangeRate("13.09.21",
                new Dollar(),
                new Ruble()
        );
        dollarToRubles.getCourse();

        // 1 рубль в доллары
        ExchangeRate rubleToDollars = new ExchangeRate("13.09.21",
                new Ruble(),
                new Dollar()
        );
        rubleToDollars.getCourse();
    }
}
