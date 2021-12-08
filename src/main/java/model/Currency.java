package model;

import java.util.HashMap;
import java.util.Map;

public class Currency {

    private static final Map<Integer, String> codes = new HashMap<>(initCodes()); // коллекция, которая хранит в себе коды всех валют
    private final String code;
    private final int digitalCode;

    public Currency(int code) {
        this.digitalCode = code;
        if(codes.containsKey(code)) {
            this.code = codes.get(digitalCode);
        } else {
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
    private static Map<Integer, String> initCodes() {
        Map<Integer, String> c = new HashMap<>();
        c.put(810, "RUB");
        c.put(840, "USD");
        c.put(978, "EUR");
        return c;
    }
}
