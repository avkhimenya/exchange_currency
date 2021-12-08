package model;

import java.util.HashMap;
import java.util.Map;

public class Currency {

    private static final Map<Integer, String> codes = new HashMap<>(allCurrency()); // коллекция, которая хранит в себе коды всех валют

    private final String code;
    private final int digitalCode;  // цифровой код валюты

    public Currency(int code) {
        this.digitalCode = code;

        if(codes.containsKey(code)) {
            this.code = codes.get(digitalCode);
        } else {
            // если валюты не существует, выкидаваю exception
            System.out.println("(!) fatal error & blue screen");
            throw new RuntimeException();
        }
    }

    public static Map<Integer, String> getCodes() {
        return codes;
    }

    public String getCode() {
        return code;
    }

    public int getDigitalCode() {
        return digitalCode;
    }

    // ?
    private static Map<Integer, String> allCurrency() {
        // все валюты
        Map<Integer, String> c = new HashMap<>();
        c.put(810, "rub");
        c.put(840, "usd");
        c.put(978, "eur");
        return c;
    }
}
